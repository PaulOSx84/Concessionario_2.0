package sample.auto;


import sample.Utility;
import sample.auto.specs.Auto;
import sample.proprietari.specs.Proprietario;

public class AutoUsata extends Auto {

    private int km;
    private int anno;

    public AutoUsata(String nome, String marca, int prezzo, int cilindrata, int km, int anno)
    {
        super(nome, marca, prezzo, cilindrata);
        this.km = km;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public void stampaInfoDettagliate()
    {
        Utility.stampa("Km: " + this.km);
        Utility.stampa("Anno di vendita: " + this.anno);
    }
}
