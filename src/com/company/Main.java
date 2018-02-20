package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("I think of number from 1 to 100. Try to guess it.");

        int myNum = random.nextInt(100) + 1;

        System.out.println(myNum);
        for (int i = 1; i <= 10; i++) {
            int userNum = scanner.nextInt();

            System.out.println(userNum);


            if (myNum > userNum) {
                System.out.println("мое число больше");
            } else if (myNum < userNum) {
                System.out.println("мое число меньше");
            } else if (myNum == userNum) {
                System.out.println("числа равны");
                break;


            }
        }
    }
}
