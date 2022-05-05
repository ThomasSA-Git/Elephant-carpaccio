package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        TaxesAndDiscounts td = new TaxesAndDiscounts();
        Beregning br = new Beregning();
        td.discount(ui.numberOfWares(), ui.priceOfWares());
        td.stateTaxes(ui.stateTax());

        ui.totalPrice();
    }
}
