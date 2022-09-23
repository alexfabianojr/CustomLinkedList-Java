public class Node {
    private int valor;
    private Node proximo;
    private Node anterior;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}
