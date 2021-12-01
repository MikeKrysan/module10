package Solution10_4_2;

public class UnCkeckedException {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 0;

        try {
            if(number2 == 0) {
                throw new DivisionByZeroException("Нельзя делить на 0");     //ключевое слово throw - порождаем собственное исключение
            }
            System.out.println(number1/number2);
        } catch (DivisionByZeroException a) {
            System.err.println("Произошла ошибка");
        } finally {
            System.err.println("Программа завершает свое действие. Всего доброго!");
        }
    }
}
