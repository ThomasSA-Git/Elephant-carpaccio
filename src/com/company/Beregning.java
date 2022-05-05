package com.company;

public class Beregning {

  private int numberOfWares;
  private int priceOfWares;
  private int totalCost;

  public Beregning () {
    this.numberOfWares = numberOfWares;
    this.priceOfWares = priceOfWares;
    this.totalCost = 0;
  }

  public int getNumberOfWares() {
    return numberOfWares;
  }

  public void setNumberOfWares(int numberOfWares) {
    this.numberOfWares = numberOfWares;
  }

  public int getPriceOfWares() {
    return priceOfWares;
  }

  public void setPriceOfWares(int priceOfWares) {
    this.priceOfWares = priceOfWares;
  }

  public int getTotalCost () {
      totalCost = priceOfWares * numberOfWares;
    }

  public void setTotalCost(int totalCost) {
    this.totalCost = totalCost;
  }
}
