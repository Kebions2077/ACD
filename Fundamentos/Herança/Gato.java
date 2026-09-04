public class Gato extends Mamifero{
    private String raça;

    public Gato(String raça,int idade,float peso,String nome){
        this.raça=raça;
        super(nome,peso,idade);
    }
    public String getRaça(){
        return raça;
    }
    @Override
    public void comunicar(){
        System.out.println("Miau Miau");
    }
}