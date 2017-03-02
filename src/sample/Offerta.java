package sample;


import sample.auto.specs.Auto;
import sample.proprietari.specs.Proprietario;

public class Offerta implements Stampable {


    private Auto autoDaComprare;
    private Proprietario acquirente;
    private int prezzoOfferto;

    public Auto getAutoDaComprare() {
        return autoDaComprare;
    }

    public Proprietario getAcquirente() {
        return acquirente;
    }

    public int getPrezzoOfferto() {
        return prezzoOfferto;
    }

    public Offerta(Auto daComprare, Proprietario acquirente, int prezzoOfferto)
    {
        this.autoDaComprare = daComprare;
        this.acquirente = acquirente;
        this.prezzoOfferto = prezzoOfferto;
    }

    @Override
    public void stampaInfo()
    {
        Utility.stampaCornicetta();
        System.out.println("Offerta per: ");
        this.autoDaComprare.stampaInfo();
        System.out.println("Offerta da parte di: ");
        this.acquirente.stampaInfo();
        System.out.println("Prezzo: " + this.prezzoOfferto);
        Utility.stampaCornicetta();
    }
}
