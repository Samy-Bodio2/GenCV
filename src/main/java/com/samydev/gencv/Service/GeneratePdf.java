package com.samydev.gencv.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class GeneratePdf {
    public static  void genCvPdf() throws FileNotFoundException, DocumentException {
        String path = "cv.pdf";
        Document mydoc = new Document();
        PdfWriter.getInstance(mydoc,new FileOutputStream(path));
        mydoc.open();
        Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        Font sectionFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);

        // Informations personnelles
        Paragraph personalInfo = new Paragraph("Rémi Vautrin\nrvautrin@mail.com\n0223451052\n4 allée des noyers 13020 La Ciotat");
        personalInfo.setAlignment(Element.ALIGN_LEFT);
        mydoc.add(personalInfo);

        // Profil
        Paragraph profile = new Paragraph("Profil\n10 ans d'expérience dans le développement de projets web, en particulier la conception de sites internet et d'applications. Autonome sur mon poste tout en appréciant le travail en équipe et collaborer sur site ou distante, je cherche à relever de nouveaux défis.", sectionFont);
        mydoc.add(profile);

        // Expérience professionnelle
        Paragraph experience = new Paragraph("Expérience professionnelle\n" +
                "de oct. 2016 à ce jour Développeur Web ProxiMarche. La Ciotat\n" +
                "Participation au développement et au déploiement des applications internes (ERP) et clients\n" +
                "Soutien sur la partie Frontend à l'équipe en place\n" +
                "Documentation et test de code\n" +
                "Réalisation de développements en mode agile\n" +
                "Gestion des environnements DevOps\n" +
                "\n" +
                "de sept. 2012 à sept. 2016 Développeur Web AC Market,Toulouse\n" +
                "Gestion de la migration du site de l'entreprise\n" +
                "Maintenance du site\n" +
                "Pilotage du développement des évolutions du site (du recueil du besoin à la mise en production)", sectionFont);
        mydoc.add(experience);

        // Compétences
        Paragraph skills = new Paragraph("Compétences\nSQL\nLinux\nJavascript, Python, PHP", sectionFont);
        mydoc.add(skills);

        // Langues
        Paragraph languages = new Paragraph("Langues\nAnglais", sectionFont);
        mydoc.add(languages);

        // Qualités
        Paragraph qualities = new Paragraph("Qualités\nDynamique\nCurieux\nSens du contact", sectionFont);
        mydoc.add(qualities);

        // Centres d'intérêt
        Paragraph interests = new Paragraph("Centres d'intérêt\nCinéma\nVoile", sectionFont);
        mydoc.add(interests);

        mydoc.close();
        System.out.println("Pdf generated");
    }

    }

