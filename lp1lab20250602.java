/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lp1lab20250602;

/**
 *
 * @author aluno
 */
// Classe que representa um nó da fila
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Classe que representa a fila
class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = this.tras = null;
    }

    // Verifica se a fila está vazia
    public boolean vazia() {
        return frente == null;
    }

    // Insere um elemento na fila (enqueue)
    public void enfilera(int valor) {
        Node novoNo = new Node(valor);

        if (tras == null) {
            frente = tras = novoNo;
            return;
        }

        tras.next = novoNo;
        tras = novoNo;
    }

    // Remove um elemento da fila (dequeue)
    public int desenfilera() {
        if (frente == null) {
            throw new IllegalStateException("Fila vazia");
        }

        int valor = frente.data;
        frente = frente.next;

        if (frente == null) {
            tras = null;
        }

        return valor;
    }

    // Consulta o elemento da frente da fila sem remover
    public int procura() {
        if (frente == null) {
            throw new IllegalStateException("Fila vazia");
        }

        return frente.data;
    }

    // Exibe todos os elementos da fila
    public void imprimirFila() {
        Node atual = frente;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.next;
        }
        System.out.println();
    }
}
