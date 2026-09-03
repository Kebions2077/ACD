import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private Cliente cliente;
    private List<Item> itens;
    private Pagamento pagamento;

public Pedido( Cliente cliente){
    this.cliente=cliente;
    this.itens= new ArrayList<>();
}

public void adicionarItem(Item item){
    itens.add(item);
}
public List<Item> getItens() {
    return itens;
}

public Pagamento getPagamento() {
    return pagamento;
}

public void setPagamento(Pagamento pagamento) {
    this.pagamento = pagamento;
}

public Cliente getCliente() {
    return cliente;
}
}

