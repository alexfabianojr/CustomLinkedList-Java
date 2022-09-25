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

    /***
     * 1 - Criar o novo nó
     * 2 - Referenciar no ultimo-nó o novo-nó como o próximo
     * 3 - Referenciar no novo-nó o último-nó como anterior
     * 4 - Substituir o ultimo-no pelo novo-nó como fim
     */
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
        System.out.println("-- Imprimindo do inicio ao fim");
        Node atual = this.inicio;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }

    public void imprimirDoFimAoInicio() {
        System.out.println("-- Imprimindo do fim ao inicio");
        Node atual = this.fim;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getAnterior();
        }
    }
}
