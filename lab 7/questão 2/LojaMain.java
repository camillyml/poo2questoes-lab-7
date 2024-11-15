// O padrão de projeto Template define a estrutura geral de um algoritmo em uma superclasse abstrata,
// permitindo que subclasses implementem detalhes específicos sem alterar a estrutura principal.
// O padrão Decorator, por outro lado, é usado para adicionar dinamicamente responsabilidades a um objeto, 
// decorando-o com funcionalidades adicionais sem modificar sua estrutura original.




public class LojaMain {
    public static void main(String[] args) {
        Loja pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido(5, 100.0, "Cartão de Crédito");

        Loja pedidoNaLoja = new PedidoLoja();
        pedidoNaLoja.processarPedido(3, 50.0, "Dinheiro");

        Loja pedidoCripto = new PedidoCripto();
        pedidoCripto.processarPedido(2, 200.0, "Bitcoin");
    }
}
