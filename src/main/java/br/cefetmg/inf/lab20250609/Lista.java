package br.cefetmg.inf.lab20250609;

public interface Lista {
    public void inserirInicio(int item);
    public void inserirFim(int item);
    public boolean inserirPosicao(int posicao, int item);
    public Integer removerInicio();
    public Integer removerFim();
    public Integer removerPosicao(int posicao);
    public Integer obterInicio();
    public Integer obterFim();
    public Integer obterPosicao(int posicao);
    public boolean estaVazia();
    public int pesquisar(int item);
    public int tamanho();

}