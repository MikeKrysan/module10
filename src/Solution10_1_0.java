public class Solution10_1_0 {
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 5, 3};
        int s = 0, i;
        for (i = 0; i < array.length -1; i++);  //если не отнять единицу, то консоль выдаст ошибку ArrayIndexOutOfBoundExсeption
        {
            s += array[i];
        }
        System.out.println(s);
    }
}
