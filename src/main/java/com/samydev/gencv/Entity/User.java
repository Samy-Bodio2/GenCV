package com.samydev.gencv.Entity;



public class User {
    private int Id;
    private String UserName;
    private String email;

    private  String Password;

    public User(int Id, String UserName, String email, String Password ){
        this.Id= Id;
        this.UserName=UserName;
        this.email=email;
        this.Password=Password;

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
