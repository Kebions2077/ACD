public class Produto {
    private Descriçao desc;
    private double preço;
    private int quantidadeEstoque;

    public  Produto(Descriçao desc, double preço, int quantidadeEstoque) {
    this.desc =desc;
    this.preço =preço;
    this.quantidadeEstoque =quantidadeEstoque;
    }
    public Descriçao getDesc(){
        return desc;
    }
    public double getPreço(){
        return preço;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
}
