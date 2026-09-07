public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Cliente var1 = new Cliente("asdasdafd", "00.000.000-00");
        Produto var2 = new Produto(Descriçao.ARROZ, 12.9, 100);
        Produto var3 = new Produto(Descriçao.FEIJAO, (double)5.5F, 50);
        Produto var4 = new Produto(Descriçao.LEITE, (double)13.0F, 30);
        Produto var5 = new Produto(Descriçao.FARINHA, 7.9, 40);
        Pedido var6 = new Pedido(var1);
        var6.adicionarItem(new Item(var2, 2));
        var6.adicionarItem(new Item(var3, 3));
        var6.adicionarItem(new Item(var4, 1));
        var6.adicionarItem(new Item(var5, 2));
        var6.setPagamento(Pagamento.DINHEIRO);
        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + var6.getCliente().getNome());
        System.out.println("CPF: " + var6.getCliente().getCPF());
        System.out.println("\n=== ITENS DO PEDIDO ===");
        double var7 = (double)0.0F;

        for(Item var10 : var6.getItens()) {
            double var11 = var10.getProduto().getPreço() * (double)var10.getQuantidade();
            System.out.printf("%s: %d x R$ %.2f = R$ %.2f%n", var10.getProduto().getDesc(), var10.getQuantidade(), var10.getProduto().getPreço(), var11);
            var7 += var11;
        }

        System.out.printf("\nTotal do pedido: R$ %.2f%n", var7);
        System.out.println("Forma de pagamento: " + String.valueOf(var6.getPagamento()));
    }
}
