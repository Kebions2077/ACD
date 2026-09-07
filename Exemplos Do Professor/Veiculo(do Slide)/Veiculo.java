public class Veiculo{
    private int velocidade,vel_max=120;
    private boolean estado = false;

    public Veiculo(int velocidade,int vel_max,boolean estado){
        this.velocidade=velocidade;
        this.vel_max=vel_max;
        this.estado=estado;
    }
    public int getVelocidade(){return velocidade;}
    public int getVel_max(){return vel_max;}
    public boolean getEstado(){return estado;}

    void status(){
        if(this.estado !=false){
            System.out.println("O Motor está ligado");
        }
        else {
            System.out.println("O Motor está desligado");
        }
    }
    void parar(){
        if (this.estado !=false){
            System.out.println("Desligando Motor..");
            this.estado=false;
        }
        else {
            System.out.println("O Motor ja está Desligado");
        }
    }
    void ligar(){
        if (this.estado !=true){
            System.out.println("Ligando Motor..");
            this.estado= true;
        }
        else {
            System.out.println("O Motor ja esta ligado");
        }
    }
    void acelerar_max(){
        if(this.estado == false){
            System.out.println("O motor esta desligado, impossivel acelerar");
        }
        else if(this.velocidade == this.vel_max){
            System.out.println("Ja esta na velocidade maxima");
        }
        else{
            this.velocidade=this.vel_max;
            System.out.println("Acelerando ate velocidade maxima");
        }

    }

}