package atividadesGenerics;

public class MainAtv3 {
    public static void main(String[] args) {
        Pedido<Alimento> pedidoAlimentos = new Pedido<>();
        pedidoAlimentos.adicionarProduto(new Alimento("Arroz", 10.90, "10/12/2026"));
        pedidoAlimentos.adicionarProduto(new Alimento("Feijao", 10.50, "05/11/2026"));

        System.out.println("Lista dos alimentos:");
        pedidoAlimentos.mostrarProdutos();

        Pedido<Eletronicos> pedidoEletronicos = new Pedido<>();
        pedidoEletronicos.adicionarProduto(new Eletronicos("Mouse", 300.0, 12));
        pedidoEletronicos.adicionarProduto(new Eletronicos("Teclado", 500.0, 12));

        System.out.println("lista dos eletronicos:");
        pedidoEletronicos.mostrarProdutos();
    }
}