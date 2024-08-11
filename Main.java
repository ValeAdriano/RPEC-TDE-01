public class Main {



    public static void main () {

        Pilha pilha = new Pilha(5);

        Pilha.push(1);
        Pilha.push(2);
        Pilha.push(3);
        Pilha.push(4);
        Pilha.push(5);

        System.out.println("Topo da pilha: " + pilha.topo());

        // Verificando se a pilha está vazia
        System.out.println("Pilha está vazia? " + pilha.isEmpty()); // Deve imprimir false
    }



}
