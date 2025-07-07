package br.cefetmg.inf.lab20250616;

public class FilaEncadeada implements Fila{
    private class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node inicio, fim;
    private int size;


    public void enfileirar(int item) {
        Node novo = new Node(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.next = novo;
            fim = novo;
        }
        size++;
    }


    public Integer desenfileirar() {
        if (estaVazia()) return null;
        int valor = inicio.data;
        inicio = inicio.next;
        if (inicio == null) fim = null;
        size--;
        return valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }


    public int tamanho() {
        return size;
    }
}