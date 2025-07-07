package br.cefetmg.inf.lab20250602;
public class FilaArray {
    int topo = 0;
    Integer[] itens = new Integer[10];

    private void aumentarFila() {
        Integer[] newItens = new Integer[itens.length + 10];
        for (int i = 0; i < topo; i++) {
            newItens[i] = itens[i];
        }
        itens = newItens;
    }

    void enfileirar(int item) {
        if (topo == itens.length) {
            aumentarFila();
        }
        itens[topo] = item;
        topo++;
    }

    Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        Integer removido = itens[0];
        for (int i = 1; i < topo; i++) {
            itens[i - 1] = itens[i];
        }
        topo--;
        return removido;
    }

    boolean estaVazia() {
        return topo == 0;
    }

    int tamanho() {
        return topo;
    }
}