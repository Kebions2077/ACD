public abstract class Empregado {
    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome=n;
    }

    public abstract double pagamentoSemanal(double horasTrabalhadas);

    }
