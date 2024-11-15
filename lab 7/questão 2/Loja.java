public abstract class Loja {
    
 public abstract void realizarEntrega();
 public abstract void processarPagamento(double total, String formaPagamento);
 public abstract boolean precisaEntrega();
 double calcularTotal(int qtd, double valor) {
        return qtd * valor;
    }

  
    public void processarPedido(int qtd, double valor, String formaPagamento) { //template
        double total = calcularTotal(qtd, valor);
        processarPagamento(total, formaPagamento);
        if (precisaEntrega() == true) {
            realizarEntrega();
        } else {
            System.out.println("Sem necessidade de entrega.");
        }
    }
}


