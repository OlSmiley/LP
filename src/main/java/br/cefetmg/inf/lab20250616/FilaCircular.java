package br.cefetmg.inf.lab20250616;

public class FilaCircular implements Fila{
    private int[] data;
    private int inicio, fim, size;
    private static final int CAPACIDADE = 10;

    public FilaCircular() {
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

    public void enfileirar(int item) {
        garantirCapacidade();
        data[fim] = item;
        fim = (fim + 1) % data.length;
        size++;
    }

    public Integer desenfileirar() {
        if (estaVazia()) return null;
        int valor = data[inicio];
        inicio = (inicio + 1) % data.length;
        size--;
        return valor;
    }

    public boolean estaVazia() {
        return size == 0;
    }

    public int tamanho() {
        return size;
    }
}