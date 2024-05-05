class Prog{
   public static void main(String[] args) {
        
TimeDeFutebol time1 = new TimeDeFutebol("ABC", TimeDeFutebol.ATAQUE);
TimeDeFutebol time2 = new TimeDeFutebol("ADS", TimeDeFutebol.RETRANCA);
 
   Campeonato c= new Campeonato("Paulista");
   TimeDeFutebol vasco = new TimeDeFutebol("vasco",TimeDeFutebol.ATAQUE);

   c.realizaJogos(time1,time2);
   c.realizaJogos(time2,vasco);
   c.realizaJogos(vasco,time1);
   c.realizaJogos(vasco,time2);

   time1.imprime();
   time2.imprime();
   vasco.imprime();
   c.imprime();

    }
}
