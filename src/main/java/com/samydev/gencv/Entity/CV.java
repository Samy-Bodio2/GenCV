package com.samydev.gencv.Entity;

import java.util.List;

public class CV {

    private  int Id;
    private  String DateCreation;
    private  String DateModification;
    private Emploi emploi;
    private Profil profil;
    private List<Formation> formations;
    private List<ExperiencePro> experiencesPro;

    private List<Competence> competences;
    private User user;

    public  CV(int id, String dateCreation,  String dateModification,
               Emploi emploi,Profil profil, List<Formation> formations, List<ExperiencePro> experiencesPro, List<Competence> competences, User user){
        Id=id;
        DateCreation=dateCreation;
        DateModification=dateModification;
        this.emploi=emploi;
        this.profil=profil;
        this.formations=formations;
        this.experiencesPro=experiencesPro;
        this.competences=competences;
        this.user=user;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDateCreation() {
        return DateCreation;
    }

    public void setDateCreation(String dateCreation) {
        DateCreation = dateCreation;
    }

    public String getDateModification() {
        return DateModification;
    }

    public void setDateModification(String dateModification) {
        DateModification = dateModification;
    }

    public Emploi getEmploi() {
        return emploi;
    }

    public void setEmploi(Emploi emploi) {
        this.emploi = emploi;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<ExperiencePro> getExperiencesPro() {
        return experiencesPro;
    }

    public void setExperiencesPro(List<ExperiencePro> experiencesPro) {
        this.experiencesPro = experiencesPro;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
