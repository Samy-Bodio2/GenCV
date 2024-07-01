package com.samydev.gencv.Entity;

import java.util.Date;

public class ExperiencePro {
    private int Id;
    private String Title;
    private String Entreprise;
    private String DateDebut;
    private String DateFin;
    private String Description;

    public ExperiencePro(int id,String title, String entreprise, String dateDebut, String dateFin, String descrtipion){
        Id=id;
        Title=title;
        Entreprise=entreprise;
        DateDebut=dateDebut;
        DateFin=dateFin;
        Description=descrtipion;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEntreprise() {
        return Entreprise;
    }

    public void setEntreprise(String entreprise) {
        Entreprise = entreprise;
    }

    public String getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(String dateDebut) {
        DateDebut = dateDebut;
    }

    public String getDateFin() {
        return DateFin;
    }

    public void setDateFin(String dateFin) {
        DateFin = dateFin;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
