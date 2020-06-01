public class Node {
    private int info;
    private Node esquerda;
    private Node direita;

    public Node(int info){
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
    public void setInfo(int info){
        this.info = info;
    }
    public int getInfo(){
        return info;
    }
    public void setDireita(Node direita){
        this.direita = direita;
    }
    public void setEsquerda(Node esquerda){
        this.esquerda = esquerda;
    }
    public Node getEsquerda(){
        return esquerda;
    }

    public Node getDireita() {
        return direita;
    }
}
