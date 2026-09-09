public class Divisao extends Operaçao{
    public Divisao(float operando1,float operando2){
        super(operando1,operando2);
    }
    @Override
    public float calcular(){
        return getOperando1()/getOperando2();
    }
}
