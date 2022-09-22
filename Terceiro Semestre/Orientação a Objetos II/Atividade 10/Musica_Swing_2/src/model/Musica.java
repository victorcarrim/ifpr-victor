/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author victorferrari
 */
public class Musica {
    private int idMusica;
    private String nomeMusica;
    private String artistasMusica;
    private String gravadoraMusica;
    private String tempoMusica;
    private String dataProducaoMusica;

    public Musica(){
    }
    
    
    public Musica(String nomeMusica, String artistasMusica, String gravadoraMusica, String tempoMusica,
            String dataProducaoMusica) {
        this.nomeMusica = nomeMusica;
        this.artistasMusica = artistasMusica;
        this.gravadoraMusica = gravadoraMusica;
        this.tempoMusica = tempoMusica;
        this.dataProducaoMusica = dataProducaoMusica;
    }
    public Musica(int idMusica, String nomeMusica, String artistasMusica, String gravadoraMusica,
            String tempoMusica, String dataProducaoMusica) {
        this.idMusica = idMusica;
        this.nomeMusica = nomeMusica;
        this.artistasMusica = artistasMusica;
        this.gravadoraMusica = gravadoraMusica;
        this.tempoMusica = tempoMusica;
        this.dataProducaoMusica = dataProducaoMusica;
    }
    public int getIdMusica() {
        return idMusica;
    }
    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }
    public String getNomeMusica() {
        return nomeMusica;
    }
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
    public String getArtistasMusica() {
        return artistasMusica;
    }
    public void setArtistasMusica(String artistasMusica) {
        this.artistasMusica = artistasMusica;
    }
    public String getGravadoraMusica() {
        return gravadoraMusica;
    }
    public void setGravadoraMusica(String gravadoraMusica) {
        this.gravadoraMusica = gravadoraMusica;
    }
    public String getTempoMusica() {
        return tempoMusica;
    }
    public void setTempoMusica(String tempoMusica) {
        this.tempoMusica = tempoMusica;
    }
    public String getDataProducaoMusica() {
        return dataProducaoMusica;
    }
    public void setDataProducaoMusica(String dataProducaoMusica) {
        this.dataProducaoMusica = dataProducaoMusica;
    }
  
    @Override
    public String toString() {
        return "Musicas [artistasMusica=" + artistasMusica + ", dataProducaoMusica=" + dataProducaoMusica
                + ", gravadoraMusica=" + gravadoraMusica + ", idMusica=" + idMusica + ", nomeMusica=" + nomeMusica
                + ", tempoMusica=" + tempoMusica + "]";
    }
    
    
}
