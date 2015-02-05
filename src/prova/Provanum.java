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
public class Provanum {
    private int num1;
    private int num2;
    private int num3;    
   


public Provanum(int n1, int n2, int n3){
    setNum1(n1);
    setNum2(n2);
    setNum3(n3);
   // System.out.println(this.num1);
    //System.out.println(this.num2);
    //System.out.println(this.num3);
    
}

public void setNum1(int valor){
    if(valor==1){
       // System.out.println(valor);
        num1=num2+num3;
       // System.out.println(this.num1);
       // System.out.println(this.num2);
       // System.out.println(this.num3);
    }
    else if(valor==2)
        num1=num2-num3;
    else if(valor==3)
        num1=num2*num3;
    else if(valor==4)
        num1=num2/num3;
    else
        System.out.println("no es cap operacio");
}

public void setNum2(int valor){
    num2=valor;
    System.out.println(this.num2);
}
public void setNum3(int valor){
    num3=valor;
}

public int getNum1(){
    return num1;
}

public int getNum2(){
    return num2;
}

public int getNum3(){
    return num3;
}



}