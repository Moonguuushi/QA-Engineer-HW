import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
        metod5();
        metod6();
        metod7();
        metod8();



    }
    //1 Задание
    static void printThreeWords (){
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple"+ "\n");
    }

    //2 Задание
    static void chekSumSign (){
        int a = 10;
        int b = 12;
        int z = a + b;
        if (z >= 0){
            System.out.println("Сумма положительная" + "\n");
        }else {
            System.out.println("Сумма отрицательная" + "\n");
        }

    }
    //3 Задание
    static void printColor(){
        int value;
        value = 150;
        if (value <= 0){
            System.out.println("Красный" + "\n");
        } else if (value > 0 && value <= 100 ) {
            System.out.println("Желтый" + "\n");
        } else if (value > 100) {
            System.out.println("Зеленый" + "\n");
        }
    }

    //4 Задание
    static void compareNumbers(){
        int a, b;
        a = 4;
        b = 4;
        if (a >= b){
            System.out.println("a >= b" + "\n");
        }else {
            System.out.println("a < b" + "\n");
        }
    }

    //5 Задание
    static void metod5(){
        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num1 = number.nextInt();

        System.out.print("Введите целое число: ");
        int num2 = number.nextInt();

        int sum = num1 + num2;
        if (sum >= 10 && sum <=20){
            System.out.println("true" + "\n");
        }else{
            System.out.println("false" + "\n");
        }

    }

    //6 Задание
    static void metod6(){
        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num = number.nextInt();
        if (num < 0){
            System.out.println("Число отрицательное" + "\n");
        } else if (num >= 0) {
            System.out.println("Число положительное" + "\n");
        }
    }

    //7 Задание
    static void metod7(){
        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num = number.nextInt();
        if (num < 0){
            System.out.println("true" + "\n");
        }else {
            System.out.println("false" + "\n");
        }
    }

    //8 Задание
    static void metod8(){
        Scanner in = new Scanner(System.in);

        System.out.print("Ведите текст: ");
        String text = in.nextLine();

        System.out.print("Введите число: ");
        int count = in.nextInt();

        for (int i = 0; i < count; i++)
            System.out.println(text);
    }
}