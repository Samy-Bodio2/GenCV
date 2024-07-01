package com.samydev.gencv.Entity;


public class Emploi {
    private int Id;
    private String Poste;

    public Emploi (int id, String poste){
        Id=id;
        Poste=poste;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPoste() {
        return Poste;
    }

    public void setPoste(String poste) {
        Poste = poste;
    }
}
