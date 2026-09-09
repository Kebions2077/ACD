
public class Multiplication extends Expression{
    private Expression dir;
    private Expression esq;

    public Multiplication(Expression dir,Expression esq){
        this.dir=dir;
        this.esq=esq;

    }
    @Override

    public double evaluate (){
        return esq.evaluate()*dir.evaluate();
    }
}
