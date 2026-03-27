package atividadesGenerics;

public class MainAtv1 {
    public static void main(String[] args) {
        Dado<String> d1 = new Dado<>("Oi");
        Dado<Integer> d2 = new Dado<>(10);
        Dado<Pessoa> d3 = new Dado<>(new Pessoa("Gustavo", 19));

        System.out.println(d1.getDado());
        System.out.println(d2.getDado());
        System.out.println(d3.getDado().toString());
    }
}