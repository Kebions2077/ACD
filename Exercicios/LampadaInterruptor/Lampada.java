package Exercicios.LampadaInterruptor;

public class Lampada {
    boolean energizada=false;

    void energizar(){
        if(energizada == false){energizada=true;}
        else {System.out.println("Lampada já esta ligada esta ligada");}
    }
    void desenergizar(){
        if(energizada== false){System.out.println("A Lampada ja esta desligada");}
        else{energizada=false;}
    }
    void mostrar(){
        if(energizada==true){ System.out.println("A Lampada Esta ligada");}
        else{System.out.println("A Lampada está desligada");
        }
    }
    
}
 