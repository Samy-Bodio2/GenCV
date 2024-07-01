package com.samydev.gencv.Entity;

import java.util.List;

public class Profil {
    private int Id;
    private  String Name;
    private String LastName;
    private String PhoneNumber;
    private String Email;
    private String Addresse;
    private String DescriptionProfil;
    private List<String> LanguesParlees;
    private List<String> Loisirs;
    private String PhotoUrl;


    public Profil(int id, String name, String lasName, String phoneNumber, String email, String addresse,
                  String descriptionProfil, List <String> languesParlee, List<String> loisirs, String photoUrl
                  ) {
        Id = id;
        Name = name;
        LastName = lasName;
        PhoneNumber=phoneNumber;
        Email=email;
        Addresse= addresse;
        DescriptionProfil=descriptionProfil;
        LanguesParlees=languesParlee;
        Loisirs=loisirs;
        PhotoUrl=photoUrl;



    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddresse() {
        return Addresse;
    }

    public void setAddresse(String addresse) {
        Addresse = addresse;
    }

    public String getDescriptionProfil() {
        return DescriptionProfil;
    }

    public void setDescriptionProfil(String descriptionProfil) {
        DescriptionProfil = descriptionProfil;
    }

    public List<String> getLanguesParlees() {
        return LanguesParlees;
    }

    public void setLanguesParlees(List<String> languesParlees) {
        LanguesParlees = languesParlees;
    }

    public List<String> getLoisirs() {
        return Loisirs;
    }

    public void setLoisirs(List<String> loisirs) {
        Loisirs = loisirs;
    }

    public String getPhotoUrl() {
        return PhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        PhotoUrl = photoUrl;
    }
}
