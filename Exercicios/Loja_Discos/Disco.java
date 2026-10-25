public abstract class Disco{
    private String nome,artista,genero;
    private int id,ano,quantidade;
    private float preço,duraçao;
    private Especificaçao especificaçao;

    public Disco(String nome,String artista,String genero,
                 int id,int ano,int quantidade,
                 float preço,float duraçao,Especificaçao especificaçao){
                    this.nome=nome;
                    this.artista=artista;
                    this.genero=genero;
                    this.id=id;
                    this.ano=ano;
                    this.quantidade=quantidade;
                    this.preço=preço;
                    this.duraçao=duraçao;
                    this.especificaçao=especificaçao;
    }
    public String getNome(){return nome;}
    public String getArtista(){return artista;}
    public String getGenero(){return genero;}
    public int getId(){return id;}
    public int getAno(){return ano;}
    public int getQuantidade(){return quantidade;}
    public float getPreço(){return preço;}
    public float getDuraçao(){return duraçao;}

    public Especificaçao getEspecificaçao(){return especificaçao;}
}