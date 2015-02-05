/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author alumne
 */
public class Politics {
    //ATRIBUTS  
    private int diners;
    private int corr;
    
    //CONSTRUCTORS
    public Politics(int d,int c){
        setDiners(d);
        setCorr(c);
    }
    
    //MÈTODES
    public void setDiners(int entra){
        if(entra <50){
            System.out.println("Poc Cabron");                  
        }
        else if (entra < 100)
            System.out.println("Cabron");
        else
            System.out.println("Molt Cabron tiran a DESGRACIAT");
    }
    
    public void setCorr(int entra){
        if(entra >-5)
            System.out.println("Cop al clatell");
        else if(entra > -10)
            System.out.println("Preso100 anys");
        else
            System.out.println("Coll tallat");            
    }
    
    public int getDiners(){
        return diners;
    }
    
    public int getCorr(){
        return corr;
    }
}
