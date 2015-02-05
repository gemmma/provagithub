package prova;

public final class Persona {
    //ATRIBUTS
    private int edat;
    private int pes;


//CONSTRUCTOR
public Persona(int e, int p){
    setEdat(e);
    setPes(p);
}

//MÈTODES
public void setEdat(int valor){
    if(valor ==-1)
        edat=100;
    else if(valor>0)
        edat=valor;
    else
        System.out.println("l'edat no pot ser negativa");
}

public void setPes(int valor){
    pes=valor;
}

public int getEdat(){
    return edat;
}

public int getPes(){
    return pes;
}

}