package br.cefetmg.inf.lab20250609;
public class ListaEncadeada implements Lista {

    private class Nodo {
        int valor;
        Nodo proximo;

        Nodo(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public ListaEncadeada() {
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
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        Nodo novo = new Nodo(item);
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (estaVazia()) {
            return null;
        }
        int valor = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;
        if (inicio == null) {
            fim = null;
        }
        return valor;
    }

    public Integer removerFim() {
        if (estaVazia()) {
            return null;
        }
        if (tamanho == 1) {
            int valor = inicio.valor;
            inicio = fim = null;
            tamanho = 0;
            return valor;
        }
        Nodo atual = inicio;
        while (atual.proximo != fim) {
            atual = atual.proximo;
        }
        int valor = fim.valor;
        fim = atual;
        fim.proximo = null;
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
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        int valor = atual.proximo.valor;
        atual.proximo = atual.proximo.proximo;
        tamanho--;
        return valor;
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