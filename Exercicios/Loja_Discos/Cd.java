public class Cd extends Disco{
    private Mixagem mixagem;

    public Cd(String nome, String artista, String genero, String tam,
                 int id, int ano, int quantidade, int RPM,
                 float preço, float duraçao,Especificaçao especificaçao,Mixagem mixagem) {
        super(nome, artista, genero, id, ano, quantidade, preço, duraçao,especificaçao);
        this.mixagem=mixagem;
}
public Mixagem getMixagem(){return mixagem;}
}