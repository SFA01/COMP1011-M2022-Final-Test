package ca.georgiancollege.comp1011m2022finaltest;

public class Product {

  //Here I am doing the private instances members
  private int Sku;
  private String Name;
  private double SalePrice;
  private double RegularPrice;
  private String UrlInformation;

  //Here I am doing the getters and setters

  public int getSku() {
    return Sku;
  }

  public void setSku(int sku) {
    Sku = sku;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public double getSalePrice() {
    return SalePrice;
  }

  public void setSalePrice(double salePrice) {
    SalePrice = salePrice;
  }

  public double getRegularPrice() {
    return RegularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    RegularPrice = regularPrice;
  }

  public String getUrlInformation() {
    return UrlInformation;
  }

  public void setUrlInformation(String urlInformation) {
    UrlInformation = urlInformation;
  }

  //Here I am doing an override method
  @Override
  public String toString() {
    return Name + SalePrice;
  }
}
