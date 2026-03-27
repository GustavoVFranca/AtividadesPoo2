package atividadesGenerics;

public class Dado<T> {
    private T dado;

    public Dado(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
}
