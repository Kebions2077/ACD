public abstract class Operaçao {
    private float operando1;
    private float operando2;

    public Operaçao(float operando1,float operando2){
        this.operando1=operando1;
        this.operando2=operando2;
    }
    public float getOperando1(){return operando1;}
    public float getOperando2(){return operando2;}
    public void setOperando1(){ this.operando1=operando1;}
    public void setOperando2(){ this.operando2=operando2;}

    public  abstract float calcular();
}
