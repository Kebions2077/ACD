
public abstract class Mamifero{
    private String nome;
    private float peso;
    private int idade;


public Mamifero(String nome,float peso, int idade){
    this.nome=nome;
    this.peso=peso;
    this.idade=idade;
}
public String getNome(){
    return nome;
}
public float getPeso(){
    return peso;
}
public int getIdade(){
    return idade;
}

public void comunicar(){
 System.out.println("comunicando");
}
}
