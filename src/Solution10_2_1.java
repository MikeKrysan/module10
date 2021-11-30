import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution10_2_1 {
    public static void main(String[] args) throws IOException {

        //ArithmeticException
        //int a = 5;
        //int b = 0;
        //int c = a/b;
        //System.out.println(c);

        //ArrayIndexOutOfBoundsException
        //int[] array = {1, 2, -1, 5, 3};
        //int s = 0, i;
        //for (i = 0; i <= array.length; i++);  //если не отнять единицу, то консоль выдаст ошибку ArrayIndexOutOfBoundExсeption
        //{
        //    s += array[i];
        //}
        //System.out.println(s);

        //ArrayStoreException
        //Object x[] = new String[3];
        //x[0] = new Integer(0);

        //ClassCastException
        //Object i = Integer.valueOf(42);
        //String s = (String)i;            // ClassCastException thrown here.

        //NegativeArraySizeException
        //int arrSize = -8;
        //int[] myArray = new int[arrSize];

        //NullPointerException      //1
        //Object obj = null;
        //obj.hashCode();
        //или:
        //Integer num;
        //num = new Integer(10);

        //NumberFormatException     //2
        //String inputString = "123.3";
        //int a = Integer.parseInt(inputString);

        //StringIndexOutOfBoundsException       //3
        String str = "Hello how are you";
        System.out.println("Length of the String: "+str.length());
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        //Accessing element at greater than the length of the String
        System.out.println(str.charAt(18));

    }
}

/*
1.
https://coderoad.ru/218384/%D0%A7%D1%82%D0%BE-%D1%82%D0%B0%D0%BA%D0%BE%D0%B5-NullPointerException-%D0%B8-%D0%BA%D0%B0%D0%BA-%D0%B5%D0%B3%D0%BE-%D0%B8%D1%81%D0%BF%D1%80%D0%B0%D0%B2%D0%B8%D1%82%D1%
2.
https://overcoder.net/q/809859/%D1%87%D1%82%D0%BE-%D1%82%D0%B0%D0%BA%D0%BE%D0%B5-numberformatexception-%D0%B8-%D0%BA%D0%B0%D0%BA-%D1%8F-%D0%BC%D0%BE%D0%B3%D1%83-%D1%8D%D1%82%D0%BE-%D0%B8%D1%81%D0%BF%D1%80%D0%B0%D0%B2%D0%B8%D1%82%D1%8C
3.
https://www.tutorialspoint.com/how-to-handle-stringindexoutofboundsexception-in-java
 */