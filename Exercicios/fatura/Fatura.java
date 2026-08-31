package teste.fatura;

import java.util.ArrayList;

public class Fatura{
    private int quan_itens;
    private String nome;
    private float valor_fat;
    private boolean pago;
    private ArrayList<Item> itens;

    public Fatura(){
        this.quan_itens = 0;
        this.nome = null;
        this.pago = false;
        this.valor_fat = 0;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
        this.quan_itens++;
        this.valor_fat += (item.preço * item.qnt);
    }

    public void setNomeCliente(String nome) {
        this.nome = nome;
    }

    void pagar_fatura(float pagamento){
        if(this.pago) {
            System.out.println("Fatura já foi paga!");
            return;
        }

        if(pagamento >= this.valor_fat){
            float troco = pagamento - this.valor_fat;
            System.out.println("Fatura paga com sucesso!!");
            if(troco > 0) {
                System.out.println("Troco: R$" + troco);
            }
            this.pago = true;
        }
        else{
            float restante = this.valor_fat - pagamento;
            System.out.println("Ainda falta R$" + restante + " para pagar a fatura");
        }
    }

    void resumo(){
        System.out.println("----------------------------------------");
        System.out.println("------------Resumo Da Fatura------------");
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("Valor da fatura: R$" + this.valor_fat);
        System.out.println("Quantidade de Itens: " + this.quan_itens);
        System.out.println("Status: " + (this.pago ? "PAGA" : "PENDENTE"));
        System.out.println("---------Itens da Fatura---------------");
        for(Item item : itens) {
            System.out.println("ID: " + item.id + " | " + item.nome +
                    " | Qnt: " + item.qnt + " | Preço: R$" + item.preço);
        }
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
    }
}