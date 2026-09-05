public class Pessoa{
    private String nome,sobrenome,celular;

    public Pessoa(String nome,String sobrenome,String celular){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.celular=celular;}

    public String getNome(){return nome;}
    public String getSobrenome(){return sobrenome;}
    public String getCelular(){return celular;}
}