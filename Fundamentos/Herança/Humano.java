public class Humano extends Mamifero{
    private String sobrenome;


    public Humano(String nome,String sobrenome,float peso,int idade){
        super(nome,peso,idade);
        this.sobrenome=sobrenome;

    }
   public String getSobrenome(){
        return sobrenome;
   }
    @Override

    public void comunicar(){
        System.out.println("blablabla");
    }
}