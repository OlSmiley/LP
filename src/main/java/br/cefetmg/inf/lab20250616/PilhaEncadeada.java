package br.cefetmg.inf.lab20250616;

public class PilhaEncadeada implements Pilha{
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node topo;
    private int size;

    public void empilhar(int item) {
        Node novo = new Node(item);
        novo.next = topo;
        topo = novo;
        size++;
    }

    public Integer desempilhar() {
        if (estaVazia()) return null;
        int valor = topo.data;
        topo = topo.next;
        size--;
        return valor;
    }

    public Integer obterNoTopo() {
        return estaVazia() ? null : topo.data;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public int tamanho() {
        return size;
    }
}