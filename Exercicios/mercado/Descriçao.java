public enum Descriçao{
    ARROZ(12.90),
    FEIJAO(5.50),
    FARINHA(7.90),
    LEITE(13);


private double preço;

Descriçao(double preço)
{

    this.preço= preço;
}
public double getPreço() {

    return preço;
}
}