package br.cefetmg.inf.lab20250602;

public class FilaEncadeada {
    private class Nodo {
        int valor;
        Nodo seguinte;

        Nodo(int valor) {
            this.valor = valor;
            this.seguinte = null;
        }
    }

    private Nodo primeiro;
    private Nodo ultimo;
    private int quantidade;

    public FilaEncadeada() {
        primeiro = null;
        ultimo = null;
        quantidade = 0;
    }

    public void enfileirar(int valor) {
        Nodo novo = new Nodo(valor);

        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.seguinte = novo;
        }

        ultimo = novo;
        quantidade++;
    }

    public Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        int retirado = primeiro.valor;
        primeiro = primeiro.seguinte;
        quantidade--;

        if (primeiro == null) {
            ultimo = null;
        }

        return retirado;
    }

    public int tamanho() {
        return quantidade;
    }

    public boolean estaVazia() {
        return tamanho() == 0;
    }
}