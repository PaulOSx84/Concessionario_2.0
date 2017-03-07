package sample;


import sample.auto.specs.Auto;
import sample.proprietari.specs.Proprietario;

public class Offerta implements Stampable {


    private Auto autoDaComprare;
    private Proprietario acquirente;
    private double prezzoOfferto;

    public Auto getAutoDaComprare() {
        return autoDaComprare;
    }

    public Proprietario getAcquirente() {
        return acquirente;
    }

    public double getPrezzoOfferto() {
        return prezzoOfferto;
    }

    public Offerta(Auto daComprare, Proprietario acquirente, double prezzoOfferto)
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
        System.out.println(this.autoDaComprare.getNome()+" "+this.autoDaComprare.getMarca()+" cil. "+this.autoDaComprare.getCilindrata()+" "+this.autoDaComprare.getPrezzo()+"€");
        System.out.println("Offerta da parte di: ");
        System.out.println(this.acquirente.getNome());
        System.out.println("Prezzo: " + this.prezzoOfferto);
        Utility.stampaCornicetta();
    }
}
