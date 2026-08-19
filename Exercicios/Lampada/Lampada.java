package Exercicios.Lampada;

public class Lampada {

        boolean energizada = false;

        void energizar(){
            if(energizada==true){
                System.out.println("Ela Ja está ligada");
            }
            else{
                energizada = true;
            }
        }
        void desenergizar(){
            if(energizada==false){
                System.out.println("Ela já está desligada");
            }
            else{
                energizada=false;

            }
        }
        void estado(){
            if(energizada==true){
                System.out.println("Lampada está ligada");
            }
            else{
                System.out.println("Lampada está desligada");
            }
        }
    }


