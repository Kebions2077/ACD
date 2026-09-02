public class Horista extends Empregado{
    private double salarioAnual;

    public Horista(String nome,double salarioAnual){
        this.salarioAnual=salarioAnual;
        setNome(nome);
    }
    @Override
public double pagamentoSemanal(double horasTrabalhadas){
if(horasTrabalhadas<40){
    return horasTrabalhadas * salarioAnual;
}
else{
    return (40 * salarioAnual) + (horasTrabalhadas-40)* salarioAnual*1.5;
}
    }
}