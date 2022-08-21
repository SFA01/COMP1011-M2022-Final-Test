package ca.georgiancollege.comp1011m2022finaltest;

public class Customer {

    //Here I am doing the private instances members
    private int id;
    private String name;
    private String lastname;
    private String PhoneNumber;
    private String Products;

    //Here I am doing the getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getProducts() {
        return Products;
    }

    public void setProducts(String products) {
        Products = products;
    }

    //Here I am doing the constructors
    public Customer(int id, String name, String lastname, String phoneNumber, String products) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        PhoneNumber = phoneNumber;
        Products = products;
    }
}
