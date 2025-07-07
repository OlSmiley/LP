package br.cefetmg.inf.lab20250609;

public class ListaDuplamenteEncadeada implements Lista {

    private class Nodo {
        int valor;
        Nodo anterior;
        Nodo proximo;

        Nodo(int valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirInicio(int item) {
        Nodo novo = new Nodo(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirFim(int item) {
        Nodo novo = new Nodo(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) {
            return false;
        }
        if (posicao == 0) {
            inserirInicio(item);
            return true;
        }
        if (posicao == tamanho) {
            inserirFim(item);
            return true;
        }

        Nodo atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        Nodo novo = new Nodo(item);
        Nodo anterior = atual.anterior;

        novo.proximo = atual;
        novo.anterior = anterior;
        anterior.proximo = novo;
        atual.anterior = novo;

        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (estaVazia()) {
            return null;
        }
        int valor = inicio.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerFim() {
        if (estaVazia()) {
            return null;
        }
        int valor = fim.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho || estaVazia()) {
            return null;
        }
        if (posicao == 0) {
            return removerInicio();
        }
        if (posicao == tamanho - 1) {
            return removerFim();
        }

        Nodo atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        Nodo anterior = atual.anterior;
        Nodo proximo = atual.proximo;

        anterior.proximo = proximo;
        proximo.anterior = anterior;

        tamanho--;
        return atual.valor;
    }

    public Integer obterInicio() {
        if (estaVazia()) {
            return null;
        }
        return inicio.valor;
    }

    public Integer obterFim() {
        if (estaVazia()) {
            return null;
        }
        return fim.valor;
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho || estaVazia()) {
            return null;
        }
        Nodo atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int pesquisar(int item) {
        Nodo atual = inicio;
        int pos = 0;
        while (atual != null) {
            if (atual.valor == item) {
                return pos;
            }
            atual = atual.proximo;
            pos++;
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }
}