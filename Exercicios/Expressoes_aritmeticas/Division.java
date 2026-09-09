
public class Division extends Expression{
    private Expression dir;
    private Expression esq;

    public Division (Expression dir,Expression esq){
        this.dir=dir;
        this.esq=esq;

    }
    @Override

    public double evaluate (){
        return esq.evaluate()/dir.evaluate();
    }
}
