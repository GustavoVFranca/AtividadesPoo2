package atividadesGenerics;

public class Eletronicos extends ProdutoX {
    private int garantiaMeses;

    public Eletronicos(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Eletronicos [");
        builder.append(super.toString());
        builder.append(", garantiaMeses=");
        builder.append(garantiaMeses);
        builder.append("]");
        return builder.toString();
    }
}