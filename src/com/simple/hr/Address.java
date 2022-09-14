package com.simple.hr;

public class Address {
    private String street;
    private String city;
    private String province;
    private String zip;
    private String country;

    public Address(String street, String city, String province, String zip, String country) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.zip = zip;
        this.country = country;
    }

    public void getAddress() {
        System.out.println(
                "Street: " + street
                        + "\nCity: " + city
                        + "\nProvince: " + province
                        + "\nZip: " + zip
                        + "\nCountry: " + country);
    }
}
