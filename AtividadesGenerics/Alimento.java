package atividadesGenerics;

public class Alimento extends ProdutoX {
    private String validade;

    public Alimento(String nome, double preco, String validade) {
        super(nome, preco);
        this.validade = validade;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Alimento [");
        builder.append(super.toString());
        builder.append(", validade=");
        builder.append(validade);
        builder.append("]");
        return builder.toString();
    }
}