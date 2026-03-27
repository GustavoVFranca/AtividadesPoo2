package atividadesGenerics;

public class MainAtv4 {
    public static void main(String[] args) {
        Mapa<Integer> mapa = new Mapa<>();

        System.out.println(mapa.put("um", 1));
        System.out.println(mapa.put("dois", 2));
        System.out.println(mapa.put("um", 3));

        System.out.println(mapa.get("um"));

        System.out.println("tamanho: " + mapa.size());
        mapa.mostrarTodos();
    }
}
