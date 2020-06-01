public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }
    public boolean vazia(){
        return (this.raiz == null);
    }
    public void insereInfo(int info){
        Node novo = new Node(info);
        if (vazia()) this.raiz = novo;
        else{
            ArvoreBinaria arv = new ArvoreBinaria();
            if(novo.getInfo() < this.raiz.getInfo()){
                if(this.raiz.getEsquerda() == null) {
                    this.raiz.setEsquerda(novo);
                    System.out.println("Inserido o elemento " + novo.getInfo() + " Na esquerda de " + this.raiz.getInfo());
                }
                else{
                    arv.raiz = this.raiz.getEsquerda();
                    arv.insereInfo(info);
                }
            }

            else if(novo.getInfo() > this.raiz.getInfo()){
                if (this.raiz.getDireita() == null) {
                    this.raiz.setDireita(novo);
                    System.out.println("Inserido o elemento " + novo.getInfo() + " Na direita de " + this.raiz.getInfo());

                }
                else{
                    arv.raiz = this.raiz.getDireita();
                    arv.insereInfo(info);
                }
            }}
    }
    public void preOrdem(Node node){
        if(node != null){
            System.out.println(node.getInfo() + ",");
            preOrdem(node.getEsquerda());
            preOrdem(node.getDireita());
        }
    }
    public void inOrdem(Node node){
        if(node != null){
            inOrdem(node.getEsquerda());
            System.out.println(node.getInfo() + ",");
            inOrdem(node.getDireita());
        }
    }
    public  void  posOrdem(Node node){
        if(node != null){
            inOrdem(node.getEsquerda());
            inOrdem(node.getDireita());
            System.out.println(node.getInfo() + ",");
        }
    }
    public  Node removeInfoMaior(){
        ArvoreBinaria arv = new ArvoreBinaria();
        if (vazia()) System.out.println("Arvore vazia");
        else if (this.raiz.getDireita() == null) {
            if (this.raiz.getEsquerda() == null) {
                this.raiz = null;
            }
            else {
                this.raiz = this.raiz.getEsquerda();
            }
            return this.raiz;
        }

        else {
            arv.raiz = this.raiz.getDireita();
            arv.removeInfoMaior();
            this.raiz.setDireita(arv.raiz);
        }
        return null;
    }
    public Node removeInfoMenor(){
        ArvoreBinaria arv = new ArvoreBinaria();
        if (vazia()) System.out.println("Arvore vazia");
        else if (this.raiz.getEsquerda() == null) {
            if (this.raiz.getDireita() == null) {
                this.raiz = null;
            }
            else {
                this.raiz = this.raiz.getDireita();
            }
            return this.raiz;
        }

        else {
            arv.raiz = this.raiz.getEsquerda();
            arv.removeInfoMenor();
            this.raiz.setEsquerda(arv.raiz);
        }
        return null;
    }
    public Node removeInfo(int info){
        ArvoreBinaria arv = new ArvoreBinaria();
        if(this.raiz.getInfo() == info){
            if(this.raiz.getDireita() == null && this.raiz.getEsquerda() == null){
                return null;
            }
            else if (this.raiz.getDireita() == null && this.raiz.getEsquerda() != null){
                return this.raiz.getEsquerda();
            }
            else  if(this.raiz.getDireita() != null && this.raiz.getEsquerda() == null){
                return this.raiz.getDireita();
            }
            else{
                ArvoreBinaria aux = new ArvoreBinaria();
                aux.raiz = this.raiz.getEsquerda();
                while (aux.raiz.getDireita() != null){
                    aux.raiz = aux.raiz.getDireita();
                }
                this.raiz.setInfo(aux.raiz.getInfo());
                aux.raiz = this.raiz.getEsquerda();
                aux.removeInfoMaior();
                this.raiz.setEsquerda(aux.raiz);
            }
        }
        else if(this.raiz.getInfo() > info){
            arv.raiz = this.raiz.getEsquerda();
            arv.removeInfo(info);
            this.raiz.setEsquerda(arv.raiz);
        }
        else if (this.raiz.getInfo() < info){
            arv.raiz = this.raiz.getDireita();
            arv.removeInfo(info);
            this.raiz.setDireita(arv.raiz);
        }
        else if(vazia()){
            System.out.println("Arvore sem elementos");
        }
        return null;
    }
    public void imprime(int status){
        if (status == 0) {
            System.out.println("Imprimindo em preOrdem \n");
            preOrdem(raiz);
        }
        if (status == 1) {
            System.out.println("Imprimindo em ordem \n");
            inOrdem(raiz);
        }
        if (status == 2) {
            System.out.println("Imprimindo em posOrdem \n");
            posOrdem(raiz);
        }
    }



}
