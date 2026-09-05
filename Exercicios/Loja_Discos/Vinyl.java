public class Vinyl extends Disco {

    private int RPM;
    private String tam;



    public Vinyl(String nome, String artista, String genero, String tam,
                 int id, int ano, int quantidade, int RPM,
                 float preço, float duraçao,Especificaçao especificaçao) {
        super(nome, artista, genero, id, ano, quantidade, preço, duraçao,especificaçao);
        this.RPM=RPM;
        this.tam=tam;

    }
    public String getTam(){return tam;}
    public int getRPM(){return RPM;}
}