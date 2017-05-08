package br.com.factum.app.model;

/**
 * Created by 16165880 on 03/04/2017.
 */

public class Materia {

    private String materia;
    private String assunto;
    private String pdf;
    private String link;

    public Materia(String materia, String assunto, String pdf, String link ){

        this.materia = materia;
        this.assunto = assunto;
        this.pdf = pdf;
        this.link = link;


    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}


