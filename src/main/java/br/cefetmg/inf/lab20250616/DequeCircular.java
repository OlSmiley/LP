package br.cefetmg.inf.lab20250616;

public class DequeCircular implements Deque{
    private int[] data;
    private int inicio, fim, size;
    private static final int CAPACIDADE = 10;

    public DequeCircular() {
        data = new int[CAPACIDADE];
        inicio = fim = size = 0;
    }

    private void garantirCapacidade() {
        if (size == data.length) {
            int[] novo = new int[data.length * 2];
            for (int i = 0; i < size; i++) {
                novo[i] = data[(inicio + i) % data.length];
            }
            data = novo;
            inicio = 0;
            fim = size;
        }
    }

    public void inserirNoInicio(int item) {
        garantirCapacidade();
        inicio = (inicio - 1 + data.length) % data.length;
        data[inicio] = item;
        size++;
    }

    public void inserirNoFim(int item) {
        garantirCapacidade();
        data[fim] = item;
        fim = (fim + 1) % data.length;
        size++;
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) return null;
        int valor = data[inicio];
        inicio = (inicio + 1) % data.length;
        size--;
        return valor;
    }

    public Integer removerUltimo() {
        if (estaVazia()) return null;
        fim = (fim - 1 + data.length) % data.length;
        int valor = data[fim];
        size--;
        return valor;
    }

    public Integer obterPrimeiro() {
        return estaVazia() ? null : data[inicio];
    }

    public Integer obterUltimo() {
        return estaVazia() ? null : data[(fim - 1 + data.length) % data.length];
    }

    public boolean estaVazia() {
        return size == 0;
    }

    public int tamanho() {
        return size;
    }
}