public class Carro extends Veiculo{
    private String placa,modelo;

    public Carro (int velocidade,int vel_max,boolean estado,String placa,String modelo){
        super(velocidade,vel_max,estado);
        this.placa=placa;
        this.modelo=modelo;
    }
    public String getPlaca(){ return placa;}
    public String getModelo(){return modelo;}


}