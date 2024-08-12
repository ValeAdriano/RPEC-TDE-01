public class Pilha {

    private int tamanhoMaximo;
    private int topo;
    private int[] pilha;

    public Pilha(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.pilha = new int[tamanhoMaximo];
        this.topo = -1; // Pilha começa vazia, então topo é -1
    }

    public void push(int elemento) {
        if (topo == tamanhoMaximo - 1) {
            System.out.println("A pilha está cheia!");
        } else {
            pilha[++topo] = elemento;
        }
    }

    public int pop() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
            return -1; // Indicando erro ao desempilhar
        } else {
            return pilha[topo--];
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanhoMaximo - 1;
    }

    // Método para retornar o elemento no topo da pilha
    public int topo() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
            return -1; // Indicando que a pilha está vazia
        } else {
            return pilha[topo];
        }
    }

    // Método para imprimir todos os elementos da pilha
    public void mostrarPilha() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + " ");
            }
            System.out.println();
        }
    }
}
