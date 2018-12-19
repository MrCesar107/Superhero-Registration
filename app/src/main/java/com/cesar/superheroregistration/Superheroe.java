package com.cesar.superheroregistration;

public class Superheroe {
    private String name;
    private String last_name;
    private String hero_name;
    private String age;
    private String address;
    private String city;

    public Superheroe(String name, String last_name, String hero_name, String age, String address, String city) {
        this.name = name;
        this.last_name = last_name;
        this.hero_name = hero_name;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    public Superheroe() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
