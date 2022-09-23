public class Lista {
    private Node inicio;
    private Node fim;

    public void adicionar(int valor) {
        if (this.inicio == null) {
            iniciarPrimeiroNodeDaLista(valor);
        } else {
            adicionarNodeExtra(valor);
        }
    }

    private void adicionarNodeExtra(int valor) {
        Node newNode = new Node();
        newNode.setValor(valor);

        this.fim.setProximo(newNode);
        newNode.setAnterior(this.fim);

        this.fim = newNode;
        newNode.setProximo(null);
    }

    private void iniciarPrimeiroNodeDaLista(int valor) {
        Node newNode = new Node();
        newNode.setValor(valor);

        this.inicio = newNode;
        this.inicio.setAnterior(null);

        this.fim = newNode;
        this.fim.setProximo(null);
    }

    public void imprimirDoInicioAoFim() {
        Node atual = this.inicio;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
