package com.loginui.desulohith.khannaserver.Model;

import java.util.List;

/**
 * Created by Desu.Lohith on 21-04-2018.
 */

public class Request {
    private String phone;
    private String address;
    private String name;
    private String total;
    private String status;
    private List<Order> foods; // list of food orders

    public Request() {

    }

    public Request(String phone, String address, String name, String total, String status, List<Order> foods) {
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.total = total;
        this.status = status;
        this.foods = foods;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
