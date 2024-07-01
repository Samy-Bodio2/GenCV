package com.samydev.gencv.Entity;

public class Competence {
    private int Id;
    private String Name;
    private String Level;

    public Competence(int id, String name, String level){
        Id=id;
        Name=name;
        Level=level;
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

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }
}
