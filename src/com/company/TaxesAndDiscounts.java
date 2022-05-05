package com.company;

public class TaxesAndDiscounts {

  public void stateTaxes() {
    double utah = 0.0685;
    double nevada = 0.08;
    double texas = 0.0625;
    double alabama = 0.04;
    double california = 0.0825;
  }

  public double discount(int numberOfWares, int priceOfWares) {
    int priceWares = numberOfWares * priceOfWares;
    double discountedPrice = 0;
    if (priceWares > 1000 && priceWares < 4999) {
      double oneK = 0.03;
      discountedPrice = (1 - oneK) * priceWares;
    } else if (priceWares > 5000 && priceWares <= 6999) {
      double fiveK = 0.05;
      discountedPrice = (1 - fiveK) * priceWares;
    } else if (priceWares > 7000 && priceWares <= 9999) {
      double sevenK = 0.07;
      discountedPrice = (1 - sevenK) * priceWares;
    } else if (priceWares > 1000 && priceWares < 49999) {
      double tenK = 0.1;
      discountedPrice = (1 - tenK) * priceWares;
    } else if (priceWares > 50000) {
      double fiftyK = 0.15;
      discountedPrice = (1 - fiftyK) * priceWares;
    }
    return discountedPrice;
  }

}

}