import java.text.NumberFormat;
import java.text.ParseException;

public class Solution10_3_1 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            //специально создаем ситуацию, которая приведет к исключению
            System.out.println(nf.parse("NOT A NUMBER"));
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец программы!");
    }
}
