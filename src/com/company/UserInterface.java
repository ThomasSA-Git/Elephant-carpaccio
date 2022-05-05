package com.company;

import java.util.Scanner;

public class UserInterface {
  public Scanner input = new Scanner(System.in);

  public int numberOfWares(){
    System.out.println("Input number of wares");
    int numberOfWares = input.nextInt();
    return numberOfWares;
  }

  public int priceOfWares(){
    System.out.println("Input price of wares");
    int priceWares = input.nextInt();
    return priceWares;
  }

  public String stateTax(){
    System.out.println("Input state tax");
    String tax = input.next();
    return tax;
  }
}
