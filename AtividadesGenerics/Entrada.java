package atividadesGenerics;

public class Entrada<T> {
    private String chave;
    private T valor;

    public Entrada(String chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() {
        return chave;
    }

    public T getValor() {
        return valor;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Entrada [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}

}