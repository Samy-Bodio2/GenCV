package com.samydev.gencv.Entity;

public class Formation {
    private int Id;
    private String Diplome;
    private String DateDebut;
    private String DateFin;

    public  Formation(int id, String diplome, String dateDebut, String dateFin){
        Id=id;
        Diplome=diplome;
        DateDebut=dateDebut;
        DateFin=dateFin;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDiplome() {
        return Diplome;
    }

    public void setDiplome(String diplome) {
        Diplome = diplome;
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
}
