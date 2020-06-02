public class Main {
    private Node no;
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        arvoreBinaria.insereInfo(30);
        arvoreBinaria.insereInfo(15);
        arvoreBinaria.insereInfo(40);
        arvoreBinaria.insereInfo(20);
        arvoreBinaria.insereInfo(10);
        arvoreBinaria.insereInfo(35);
        //arvoreBinaria.removeInfo(8);
        //arvoreBinaria.buscar(10);
        arvoreBinaria.imprime(0);


    }
}