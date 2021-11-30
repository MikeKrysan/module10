public class Solution10_3_2 {
    public static void main(String[] args) {
        String string = "123";
        try
        {
            char chr = string.charAt(10);
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println(ex.toString());
        }
        System.out.println("Конец программы!");
    }
}

/*
В обоих примерах (Solution10_3_1 и Solution10_3_2) на выводе мы увидим на выводе “Конец программы!”. То есть благодаря обработке исключения программа не упала,
а доработала до конца.
 */