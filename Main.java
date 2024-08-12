public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        // Adicionando elementos na pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        // Mostrando a pilha antes de remover um elemento
        System.out.println("Pilha antes de remover um elemento:");
        pilha.mostrarPilha();

        // Removendo um elemento do topo da pilha
        int removido = pilha.pop();
        System.out.println("Elemento removido: " + removido);

        // Mostrando a pilha após remover um elemento
        System.out.println("Pilha após remover um elemento:");
        pilha.mostrarPilha();
    }
}
