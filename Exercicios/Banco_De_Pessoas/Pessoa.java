public class Pessoa{
    private int idade;
    private String nome,CPF;

    public Pessoa(String nome,String CPF,int idade){
        this.nome=nome;
        this.CPF=CPF;
        this.idade=idade;
    }
    public int getIdade(){return idade;}
    public String getNome(){return nome;}
    public String getCPF(){return CPF;}

    public void setNome(String nome){ this.nome=nome;}
    public void setCPF(String CPF){ this.CPF=CPF;}
    public void setIdade(int idade){this.idade=idade;}

    @Override
    public String toString(){
        return "nome"+nome+
                "CPF"+CPF+
                "Idade"+idade;
    }
}