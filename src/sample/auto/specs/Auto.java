package sample.auto.specs;

import sample.Stampable;
import sample.Utility;


public abstract class Auto implements Stampable
{

    private String nome;
    private String marca;
    private double prezzo;
    private int cilindrata;

    public Auto(String nome, String marca, double prezzo, int cilindrata)
    {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.cilindrata = cilindrata;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    public abstract void stampaInfoDettagliate();

    @Override
    public void stampaInfo()
    {
        Utility.stampaCornicetta();
        Utility.stampaCornicetta();
        System.out.println("Nome: " + this.nome);
        Utility.stampa("Marca: " + this.marca);
        Utility.stampa("Prezzo: " + this.prezzo);
        Utility.stampa("Cilindrata: " + this.cilindrata);
        stampaInfoDettagliate();
        Utility.stampaCornicetta();
        Utility.stampaCornicetta();
    }
}
