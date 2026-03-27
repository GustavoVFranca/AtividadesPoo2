package atividadesGenerics;

public class MainAtv2 {
    public static void main(String[] args) {
        Produto<Integer> produto1 = new Produto<>(01, 11.90, "01/03/2026", "01/03/2027");
        Produto<String> produto2 = new Produto<>("A1", 11.50, "10/02/2026", "10/02/2027");

        System.out.println(produto1.toString());
        System.out.println(produto2.toString());
    }
}
