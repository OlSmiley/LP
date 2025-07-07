package br.cefetmg.inf.lab20250616;

public class DequeEncadeado implements Deque{
    private class Node {
        int data;
        Node ant, prox;
        Node(int data) { this.data = data; }
    }

    private Node inicio, fim;
    private int size;

    public void inserirNoInicio(int item) {
        Node novo = new Node(item);
        novo.prox = inicio;
        if (inicio != null) inicio.ant = novo;
        inicio = novo;
        if (fim == null) fim = novo;
        size++;
    }

    public void inserirNoFim(int item) {
        Node novo = new Node(item);
        novo.ant = fim;
        if (fim != null) fim.prox = novo;
        fim = novo;
        if (inicio == null) inicio = novo;
        size++;
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) return null;
        int valor = inicio.data;
        inicio = inicio.prox;
        if (inicio != null) inicio.ant = null;
        else fim = null;
        size--;
        return valor;
    }

    public Integer removerUltimo() {
        if (estaVazia()) return null;
        int valor = fim.data;
        fim = fim.ant;
        if (fim != null) fim.prox = null;
        else inicio = null;
        size--;
        return valor;
    }

    public Integer obterPrimeiro() {
        return estaVazia() ? null : inicio.data;
    }

    public Integer obterUltimo() {
        return estaVazia() ? null : fim.data;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return size;
    }
}