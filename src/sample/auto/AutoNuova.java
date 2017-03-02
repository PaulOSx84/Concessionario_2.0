package sample.auto;


import sample.auto.specs.Auto;

public class AutoNuova extends Auto{

    public AutoNuova(String nome, String marca, int prezzo, int cilindrata)
    {
        super(nome, marca, prezzo, cilindrata);
    }


    @Override
    public void stampaInfoDettagliate() {

    }
}
