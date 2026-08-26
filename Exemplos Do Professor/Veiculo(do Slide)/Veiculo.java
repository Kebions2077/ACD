public class Veiculo{
    int velocidade,vel_max=120;
    boolean estado = false;

    void status(){
        if(estado !=false){
            System.out.println("O Motor está ligado");
        }
        else {
            System.out.println("O Motor está desligado");
        }
    }
    void parar(){
        if (estado !=false){
            System.out.println("Desligando Motor..");
            estado=false;
        }
        else {
            System.out.println("O Motor ja está Desligado");
        }
    }
    void ligar(){
        if (estado !=true){
            System.out.println("Ligando Motor..");
            estado= true;
        }
        else {
            System.out.println("O Motor ja esta ligado");
        }
    }
    void acelerar_max(){
        if(estado == false){
            System.out.println("O motor esta desligado, impossivel acelerar");
        }
        else if(velocidade == vel_max){
            System.out.println("Ja esta na velocidade maxima");
        }
        else{
            velocidade=vel_max;
            System.out.println("Acelerando ate velocidade maxima");
        }

    }

}