package atividadesGenerics;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {
    private List<T> produtos;

    public Pedido() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(T produto) {
        produtos.add(produto);
    }

    public void mostrarProdutos() {
        for (T produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}