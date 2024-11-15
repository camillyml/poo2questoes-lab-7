public class PedidoLoja extends Loja {
    @Override
    public void processarPagamento(double total, String formaPagamento) {
        System.out.println("Processando pagamento online de R$ " + total + " via " + formaPagamento);
    }
    @Override
    public boolean precisaEntrega() {
        return false;
    }
    @Override
    public void realizarEntrega() {
        
    }
}
