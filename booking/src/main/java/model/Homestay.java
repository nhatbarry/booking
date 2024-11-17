/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhatb
 */
public class Homestay {
    private int homestay_id;
    private String name;
    private String location;
    private Boolean isBooked;
    private int price;
    public Homestay() {
    }
    public Homestay(int homestay_id, String name, String location, Boolean isBooked, int price) {
        this.homestay_id = homestay_id;
        this.name = name;
        this.location = location;
        this.isBooked = isBooked;
        this.price = price;
    }
    public int getHomestay_id() {
        return homestay_id;
    }
    public void setHomestay_id(int homestay_id) {
        this.homestay_id = homestay_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Boolean getIsBooked() {
        return isBooked;
    }
    public void setIsBooked(Boolean isBooked) {
        this.isBooked = isBooked;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
