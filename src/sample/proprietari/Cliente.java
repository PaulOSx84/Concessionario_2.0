package sample.proprietari;

import sample.Utility;
import sample.proprietari.specs.Proprietario;


public class Cliente extends Proprietario {

    private String cognome;
    private int eta;

    public Cliente(String nome, int capitale, String cognome, int eta)
    {
        super(nome, capitale);
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public String getNome()
    {
        return "Sig. " + this.nome;
    }


    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }


    @Override
    public void stampaInfoDettagliate()
    {
        System.out.println("Cognome: " + getCognome());
        System.out.println("Eta: " + getEta());
    }
}
