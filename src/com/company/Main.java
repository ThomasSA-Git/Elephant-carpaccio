package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        TaxesAndDiscounts td = new TaxesAndDiscounts();
        td.discount(ui.numberOfWares(), ui.priceOfWares());
        ui.stateTax();

    }
}
