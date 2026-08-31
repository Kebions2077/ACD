package teste.fatura;

public class Fatura{

    private int quan_itens;
    private String nome;
    private float valor_fat;
    private boolean pago;

    public Fatura(){
        this.quan_itens= 0;
        this.nome= null;
        this.pago= false;
        this.valor_fat= 0;
    }
    void pagar_fatura(float pagamento){

        if(pagamento== this.valor_fat){
            System.out.println("Fatura paga com sucesso!!");
            this.pago= true;
        }
        else{
            float restante;
            restante= this.valor_fat - pagamento;
            System.out.println("Ainda falta R$"+restante+"para pagar a fatura");
        }

    }
    void resumo(){
        System.out.println("----------------------------------------");
        System.out.println("------------Resumo Da Fatura--------------");
        System.out.println("Nome do Cliente:"+this.nome);
        System.out.println("Valor da fatura:"+this.valor_fat);
        System.out.println("Quantidade de Itens"+this.quan_itens);
        System.out.println("------------------------------------------");
        System.out.println("-----------------------------------------");

    }


}