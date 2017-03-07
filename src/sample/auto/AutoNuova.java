package sample.auto;


import sample.Utility;
import sample.auto.specs.Auto;

public class AutoNuova extends Auto{
	int rottamazione;
	double sconto;
	double prezzoIntero;
	
    public AutoNuova(String nome, String marca, double prezzo, int cilindrata)
    {
        super(nome, marca, prezzo, cilindrata);
        this.rottamazione = 0;
        this.sconto = 0;
        this.prezzoIntero = prezzo;
    }

    
    public double getSconto() {
		return sconto;
	}


	public void setSconto(double perc) {
		double nPrezzo;
		this.sconto = perc;
		nPrezzo = (1-perc/100)*this.getPrezzo();
		this.setPrezzo(nPrezzo);
	}


	public int getRottamazione() {
		return rottamazione;
	}


	public void setRottamazione(int valRott) {
		this.rottamazione = valRott;
		this.setPrezzo(this.getPrezzo()-valRott);
	}


	@Override
    public void stampaInfoDettagliate() {
    	System.out.println("Rottamazione: "+this.rottamazione+"€");
    	System.out.println("Sconto: "+this.sconto+"%");
    	System.out.println("Prezzo Originario intero: "+this.prezzoIntero);
    	
    }
}
