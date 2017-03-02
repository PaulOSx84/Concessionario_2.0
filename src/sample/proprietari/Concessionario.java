package sample.proprietari;

import sample.proprietari.specs.Proprietario;


public class Concessionario extends Proprietario{

    private long pIva;
    private String cFiscale;

    public Concessionario(String nome, int capitale, long pIva, String cFiscale)
    {
        super(nome, capitale);
        this.pIva = pIva;
        this.cFiscale = cFiscale;
    }

    @Override
    public String getNome()
    {
        return "Societa' " + this.nome;
    }

    public long getpIva() {
        return pIva;
    }

    public void setpIva(long pIva) {
        this.pIva = pIva;
    }

    public String getcFiscale() {
        return cFiscale;
    }

    public void setcFiscale(String cFiscale) {
        this.cFiscale = cFiscale;
    }


    @Override
    public void stampaInfoDettagliate()
    {
        System.out.println("PIVA: " + this.pIva);
        System.out.println("C.FISCALE: " + this.cFiscale);
    }

}
