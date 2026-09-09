import java.util.LinkedList;
public class Sum extends Expression{
    private Expression dir;
    private Expression esq;

    public Sum(Expression dir,Expression esq){
        this.dir=dir;
        this.esq=esq;

    }
    @Override

    public double evaluate (){
        return esq.evaluate()+dir.evaluate();
    }
}
