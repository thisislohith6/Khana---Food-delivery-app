package com.loginui.desulohith.khannaserver.Model;

/**
 * Created by Desu.Lohith on 18-03-2018.
 */

public class User {
    private String Name,Password,Phone,IsStaff;

    public User(String name, String password) {
        Name = name;
        Password = password;
    }
    public User(){
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public String getPassword(){
        return Password;
    }

    public void setPhone(String localPhone) {
        Phone = localPhone;
    }

    public String getIsStaff() {
        return IsStaff;
    }
}
