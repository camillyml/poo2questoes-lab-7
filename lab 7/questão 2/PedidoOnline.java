
public class PedidoOnline extends Loja{
    public void processarPagamento(double total, String formaPagamento) {
        System.out.println("Processando pagamento online de R$ " + total + " via " + formaPagamento);
    }
    
    public boolean precisaEntrega() {
        return true;
    }

    public void realizarEntrega() {
        System.out.println("Realizando a entrega do pedido online.");
    }
}
