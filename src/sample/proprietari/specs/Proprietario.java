package sample.proprietari.specs;

import sample.Offerta;
import sample.Stampable;
import sample.Utility;
import sample.auto.specs.Auto;

import java.util.ArrayList;

//(nome, capitale, lista auto(add, remove, lista), arrayList offerte) // stampable
public abstract class Proprietario implements Stampable
{
    protected String nome;
    private int capitale;
    private ArrayList<Auto> automobili;
    private ArrayList<Offerta> offerte;

    public Proprietario(String nome, int capitale)
    {
        this.nome = nome;
        this.capitale = capitale;
        this.automobili = new ArrayList<>();
        this.offerte = new ArrayList<>();
    }

    public abstract String getNome();

    public int getCapitale() {
        return capitale;
    }

    public void setCapitale(int capitale) {
        this.capitale = capitale;
    }

    public void addAuto(Auto auto)
    {
        automobili.add(auto);
    }

    public void removeAuto(Auto auto)
    {
        automobili.remove(auto);
    }

    public void stampaListaAuto()
    {
        for(Auto auto : automobili)
            auto.stampaInfo();
    }

    public void addOfferta(Offerta offerta)
    {
        offerte.add(offerta);
    }

    public void removeOfferta(Offerta offerta)
    {
        automobili.remove(offerta);
    }

    public void stampaListaOfferte()
    {
        for(Offerta offerta : offerte)
            offerta.stampaInfo();
    }

    @Override
    public void stampaInfo()
    {
        Utility.stampaCornicetta();
        Utility.stampaCornicetta();
        System.out.println("Nome: " + getNome());
        stampaInfoDettagliate();
        System.out.println("Capitale: " + getCapitale());
        Utility.stampaCornicetta();
        stampaListaAuto();
        Utility.stampaCornicetta();
        Utility.stampaCornicetta();
    }

    public abstract void stampaInfoDettagliate();

}
