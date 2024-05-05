public class Campeonato {
    
    private String nome;
    private int qtdJogos;
    //~ construtor
    public Campeonato (String nome){
    this.nome = nome;
    qtdJogos = 0;
        
    }
    public void realizaJogos(TimeDeFutebol timeCasa, TimeDeFutebol timeVisitante){
        qtdJogos++;
    if (timeVisitante.getEstrategia() == TimeDeFutebol.RETRANCA &&
        timeCasa.getEstrategia() == TimeDeFutebol.ATAQUE){
            timeVisitante.venceu();
            timeCasa.perdeu();
    }else {
            if (timeVisitante.getEstrategia()== TimeDeFutebol.ATAQUE){
                timeVisitante.venceu();
                timeCasa.perdeu();
            } else {
                if (timeCasa.getEstrategia()== TimeDeFutebol.RETRANCA){
                   timeVisitante.empatou();
                   timeCasa.empatou();
                }
              }
       }
    }
   public void imprime(){
    System.out.println("aconteceram " + qtdJogos + " jogos no campeonato");
   }
}
