package br.com.factum.app.model;

/**
 * Created by 16165877 on 20/03/2017.
 */

public class Provas {

    private int idProva;
    private String nomeProva;
    private int imagemProva;
    private String descricaoProva;
    private String questoes;

    public Provas(int idProva, String nomeProva, int imagemProva, String descricaoProva, String questoes){

        this.setIdProva(idProva);
        this.setNomeProva(nomeProva);
        this.setImagemProva(imagemProva);
        this.setDescricaoProva(descricaoProva);
        this.setQuestoes(questoes);
    }
    public Provas(){}

    public String getNomeProva() {
        return nomeProva;
    }

    public void setNomeProva(String nomeProva) {
        this.nomeProva = nomeProva;
    }

    public int getImagemProva() {
        return imagemProva;
    }

    public void setImagemProva(int imagemProva) {
        this.imagemProva = imagemProva;
    }

    public String getDescricaoProva() {
        return descricaoProva;
    }

    public void setDescricaoProva(String descricaoProva) {
        this.descricaoProva = descricaoProva;
    }

    public String getQuestoes() {
        return questoes;
    }

    public void setQuestoes(String questoes) {
        this.questoes = questoes;
    }


    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }
}
