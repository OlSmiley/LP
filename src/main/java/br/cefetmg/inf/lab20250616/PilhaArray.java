package br.cefetmg.inf.lab20250616;

public class PilhaArray implements Pilha {
    private int[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public PilhaArray() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            int newCapacity = data.length * 2;
            int[] newData = new int[newCapacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }


    public void empilhar(int item) {
        ensureCapacity();
        data[size] = item;
        size++;
    }


    public Integer desempilhar() {
        if (estaVazia()) {
            return null;
        }
        return data[--size];
    }


    public Integer obterNoTopo() {
        return estaVazia() ? null : data[size - 1];
    }


    public boolean estaVazia() {
        return size == 0;
    }


    public int tamanho() {
        return size;
    }
}