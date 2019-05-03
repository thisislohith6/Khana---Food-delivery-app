package com.example.admin.foood.Model;

/**
 * Created by admin on 2/22/2018.
 */

public class User {

    private String name;
    private String password;
    private String phone;
    private String IsStaff;

    public String getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }

    public User() {
    }

    public User(String Pname, String Ppassword) {
        name = Pname;
       password = Ppassword;
       IsStaff = "false";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String setname(String Pname) {
        name = Pname;
        return name;
    }

    public String getName() {
        return name;
    }

    public String getpassword() {
        return password;
    }

}
