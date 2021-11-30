import java.io.*;
import java.nio.charset.Charset;

public class Solution10_3_4 {
    /* Никаких throws и связанных с ним падений */
    public static void main(String[] args)  {
       /* можно указывать все что угодно,
          если не получится, программа вежливо расскажет,
          что именно пошло не так
        */
        if (copyFileUsingStream("src/win1251.txt",
                                "windows-1251",
                                "src/utf8.txt",
                                "utf-8")) {
            System.out.println("Перекодировка прошла удачно!");

        }

    }

    /* И здесь все удобно, не падает,
       а рассказывает по-русски, почему не получилось */
    private static boolean copyFileUsingStream(String sourceFilename, String sourceEnc,
                                               String destFilename, String descEnc) {
        Reader fis = null;
        Writer fos = null;
        try {
            fis = new InputStreamReader(new FileInputStream(new File(sourceFilename)), sourceEnc);
        } catch (FileNotFoundException e) {
            System.out.println("Файл-источник не удалось найти для чтения");
            return false;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Указана неизвестная кодировка файла-источника");
            return false;
        }

        try {
            fos = new OutputStreamWriter(new FileOutputStream(new File(sourceFilename)), sourceEnc);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Указана неизвестная кодировка файла-источника");
            return false;
        }
        catch (IOException e) {
            System.out.println("Файл-копию не удалось найти для записи");
            return false;
        }

        /* все открылось, можно копировать */

        char[] buffer = new char[1024];
        int length;
        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException ex){
            System.out.println("При копировании возникла ошибка");
            return false;
        }
        finally {
            try {
                fis.close();
                fos.close();
            }
            catch (IOException ex){
                System.out.println("Закрыть потоки не удалось...");
                return false;
            }
        }
        return true;
    }
}
