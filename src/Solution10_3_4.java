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

        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;
        try {
            InputStream inputStream= new FileInputStream(sourceFilename);
            inputStreamReader = new InputStreamReader(inputStream, sourceEnc);

        } catch (FileNotFoundException e) {
            System.out.println("Файл-источник не удалось найти для чтения");
            return false;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Указана неизвестная кодировка записывающего файла-источника");
            return false;
        }


        try {
            OutputStream outputStream= new FileOutputStream(destFilename);
            outputStreamWriter = new OutputStreamWriter(outputStream, descEnc);
            outputStreamWriter.write(String.valueOf(inputStreamReader));

        } catch (FileNotFoundException e) {
            System.out.println("Файл-копию не удалось найти для записи");
            return false;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Указана неизвестная кодировка записываемого файла");
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* все открылось, можно копировать */

        char[] buffer = new char[1024];
        int length;
        try {
            while ((length = inputStreamReader.read(buffer)) > 0) {
                outputStreamWriter.write(buffer, 0, length);
            }
        } catch (IOException ex){
            System.out.println("При копировании возникла ошибка");
            return false;
        }
        finally {
            try {
                inputStreamReader.close();
                outputStreamWriter.close();
            }
            catch (IOException ex){
                System.out.println("Закрыть потоки не удалось...");
                return false;
            }
        }
        return true;
    }
}


