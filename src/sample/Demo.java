package sample;
import sample.*;
import sample.auto.AutoNuova;
import sample.proprietari.Cliente;
import sample.proprietari.Concessionario;
public class Demo {

	public Demo() {
		AutoNuova a1 = new AutoNuova("Golf","Volkswagen",27000,1400);
    	AutoNuova a2 = new AutoNuova("Panda","Fiat",16000,1000);
    	AutoNuova a3 = new AutoNuova("Fiesta","Ford",18000,1400);
    	AutoNuova a4 = new AutoNuova("Peugeot","207",25000,1600);
    	AutoNuova a5 = new AutoNuova("Citroen","C5",28000,1600);
    	AutoNuova a6 = new AutoNuova("Ferrari","812Superfast",310000,6000);
    	Cliente cl1 = new Cliente("Paolo",230000,"De Carlo",33);
    	Cliente cl2 = new Cliente("Francesco",122000,"De Giorgi",43);
    	Offerta off = new Offerta(a6,cl1,220000);
    	a1.setRottamazione(1000);
    	a1.setSconto(20);
    	cl1.addAuto(a1);
    	cl1.addAuto(a4);
    	cl2.addAuto(a3);
    	Concessionario con1 = new Concessionario("SportAuto",450000,45666789,"FRDERT78B34E506E");
    	con1.addAuto(a2);
    	con1.addAuto(a5);
    	con1.addAuto(a6);
    	cl1.stampaInfo();
    	cl2.stampaInfo();
    	con1.stampaInfo();
    	
    	off.stampaInfo();
	}

}
