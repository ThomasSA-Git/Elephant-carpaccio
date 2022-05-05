package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of wares");
        int numberOfWares = input.nextInt();

        System.out.println("Input price of wares");
        int priceWares = input.nextInt();

        System.out.println("Input state tax");
        String tax = input.next();
    }
}
