public class Main {
    private Node no;
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        arvoreBinaria = arvoreBinaria.insereInfo(10);
        arvoreBinaria = arvoreBinaria.insereInfo(5);
        arvoreBinaria = arvoreBinaria.insereInfo(8);
        arvoreBinaria = arvoreBinaria.insereInfo(1);
        arvoreBinaria = arvoreBinaria.insereInfo(12);
        arvoreBinaria.removeInfo(10);
        arvoreBinaria.imprime(0);
        arvoreBinaria.imprime(1);
        arvoreBinaria.imprime(2);


    }
}