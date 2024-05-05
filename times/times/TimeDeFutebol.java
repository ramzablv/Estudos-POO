public class TimeDeFutebol {
    public static final int ATAQUE = 0;
    public static final int RETRANCA = 1;

    private String nome;
    private int qtdJogos;
    private int qtdPontos;
    private int estrategia;

    // metodo construtor

public TimeDeFutebol( String nome, int estrategia){
    this.nome = nome;
    this.estrategia = estrategia;
    qtdPontos = 0;
    qtdJogos =0;
    }
    public int getEstrategia(){
        return estrategia;
    }
    public void venceu(){
        qtdPontos = qtdPontos +3;
        qtdJogos ++;
    }
    public void empatou(){
        qtdPontos = qtdPontos ++;
        qtdJogos ++;
    }
    public void perdeu(){
        qtdJogos ++;
    }
    public void imprime(){
        System.out.println("pontos do time "+nome+":"+qtdPontos);
    }
    
}
