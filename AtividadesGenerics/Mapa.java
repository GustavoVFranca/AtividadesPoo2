package atividadesGenerics;

import java.util.ArrayList;
import java.util.List;

public class Mapa<T> {
    private List<Entrada<T>> elementos;

    public Mapa() {
        elementos = new ArrayList<>();
    }

    public boolean put(String chave, T valor) {
        for (Entrada<T> entrada : elementos) {
            if (entrada.getChave().equals(chave)) {
                return false;
            }
        }
        elementos.add(new Entrada<>(chave, valor));
        return true;
    }

    public Entrada<T> get(String chave) {
        for (Entrada<T> entrada : elementos) {
            if (entrada.getChave().equals(chave)) {
                return entrada;
            }
        }
        return null;
    }

    public boolean containsKey(String chave) {
        for (Entrada<T> entrada : elementos) {
            if (entrada.getChave().equals(chave)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return elementos.size();
    }

    public void mostrarTodos() {
        for (Entrada<T> entrada : elementos) {
            System.out.println(entrada);
        }
    }
}