package Solution10_1_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/Solution10_1_1/borodino.txt"), UTF_8);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in range 1.." + lines.size());
        int n = in.nextInt();
        System.out.println("This is a prediction for you:\n" + lines.get(n - 1));

    }
}

/*
Есть два варианта проверки:
int n = in.nextInt();
if (n < lines.size()) {
       System.out.println("Вот предсказание для вас:\n" + lines.get(n));
}
else {
     System.out.println("Вы ввели недопустимый номер..." );
}

Во втором так:

int n = in.nextInt();
try {
       System.out.println("Вот предсказание для вас:\n" + lines.get(n));
}
catch (Exception e) {
     System.out.println("Вы ввели недопустимый номер..." );
}

Но если мы введем отрицательное число,- тогда нужно городить очередной if.
 */