package me.bkkn.lesson3;

import java.util.Scanner;


public class Task {
    /*
    1
    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    */
    public static void guessTheNumber() {
        int max = 9;
        int min = 0;
        int rnd = (int) ((Math.random() * (max - min)) + min);
        rnd = (int) ((Math.random() * (max - min)) + min);
        Scanner scan = new Scanner(System.in);
        int trial = 0;
        while (true) {
            System.out.println("Guess the number");
            int input = scan.nextInt();
            if (input == rnd) {
                System.out.println("Success!");
                trial = 3;
                rnd = (int) ((Math.random() * (max - min)) + min);
            } else if (input < rnd) {
                System.out.println("input is less");
                ++trial;
            } else {
                System.out.println("input is more");
                ++trial;
            }
            if (trial == 3) {
                trial = 0;
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
                input = scan.nextInt();
                if (input == 0)
                    break;
            }
        }
    }

    /*
     2
    * Создать массив из слов
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
    "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",  "pepper", "pineapple",
    "pumpkin", "potato"}.
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано,
    компьютер показывает буквы, которые стоят на своих местах. apple – загаданное apricot
    - ответ игрока ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно можно пользоваться: String str = "apple"; char a = str.charAt(0);
    - метод, вернет char, который стоит в слове str на первой позиции Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.
    */
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};

    public static void guessTheWord() {
        int max = words.length - 1;
        int min = 0;
        Scanner scan = new Scanner(System.in);
        boolean proceed = true;
        int rnd = (int) ((Math.random() * (max - min)) + min);
        System.out.println(rnd);
        System.out.println(words[rnd]);
        System.out.println("Guess the word");
        while (proceed) {
            String input = scan.next();
            if (input.equals(words[rnd])) {
                System.out.println("Success!");
                proceed = false;
            } else {
                int minLength = Math.min(input.length(), words[rnd].length());
                for (int i = 0; i < minLength; i++) {
                    if (input.charAt(i) == words[rnd].charAt(i))
                        System.out.print(input.charAt(i++));
                    else
                        System.out.print("#");
                }

                for (int j = minLength; j < 16; j++)
                    System.out.print("#");

                System.out.print("\n");
                System.out.println("Try again");
            }
        }
    }
}
