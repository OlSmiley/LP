package br.cefetmg.inf.lab20250602;

public class FilaCircular {
    private Integer[] elementos;
    private int frente;
    private int tras;
    private int tamanho;
    private int capacidadeInicial = 8;

    public FilaCircular() {
        elementos = new Integer[capacidadeInicial];
        frente = 0;
        tras = 0;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void enfileirar(int elemento) {
        if (tamanho == elementos.length) {
            redimensionar();
        }

        elementos[tras] = elemento;
        tras = (tras + 1) % elementos.length;
        tamanho++;
    }

    public Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        Integer elemento = elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanho--;
        return elemento;
    }

    public Integer frente() {
        if (estaVazia()) {
            return null;
        }
        return elementos[frente];
    }

    private void redimensionar() {
        int novaCapacidade = elementos.length * 2;
        Integer[] novoArray = new Integer[novaCapacidade];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[(frente + i) % elementos.length];
        }

        elementos = novoArray;
        frente = 0;
        tras = tamanho;
    }
}