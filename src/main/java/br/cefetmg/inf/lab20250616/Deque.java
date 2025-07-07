package br.cefetmg.inf.lab20250616;


public interface Deque {
    public void inserirNoInicio(int item);
    public void inserirNoFim(int item);
    public Integer removerPrimeiro();
    public Integer removerUltimo();
    public Integer obterPrimeiro();
    public Integer obterUltimo();
    public boolean estaVazia();
    public int tamanho();
}