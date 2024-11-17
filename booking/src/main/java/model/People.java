/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhatb
 */
public class People {
    private int user_id;
    private String user_name;
    private String passpwd;
    private String name;
    private String phone;
    private String mail;
    private String user_role;
    private String homestay_booked;
    public People() {
    }
    public People(int user_id, String user_name, String passpwd, String name, String phone, String mail,
            String user_role, String homestay_booked) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.passpwd = passpwd;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.user_role = user_role;
        this.homestay_booked = homestay_booked;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getPasspwd() {
        return passpwd;
    }
    public void setPasspwd(String passpwd) {
        this.passpwd = passpwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getUser_role() {
        return user_role;
    }
    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
    public String getHomestay_booked() {
        return homestay_booked;
    }
    public void setHomestay_booked(String homestay_booked) {
        this.homestay_booked = homestay_booked;
    }
    
}
