public class Scooter extends Moto {
  private String bauletto;
  private String misuraRuote;

    public Scooter(String modello, int cilindrata, String motorizzazione, String bauletto, 
                   String misuraRuote) {
        super(modello, cilindrata, motorizzazione);
        this.bauletto = bauletto;
        this.misuraRuote = misuraRuote;
    }

    public String getBauletto() {
        return bauletto;
    }

    public void setBauletto(String bauletto) {
        this.bauletto = bauletto;
    }

    public String getMisuraRuote() {
        return misuraRuote;
    }

    public void setMisuraRuote(String misuraRuote) {
        this.misuraRuote = misuraRuote;
    }

    public String toString() {
        return super.toString()+"; Misura ruote:"+ misuraRuote+"; Bauletto:"+ bauletto;
    }

    public double sconto(){
      if (motorizzazione.equals("due tempi")) {return 300.00;}
      if (motorizzazione.equals("quattro tempi")) {return 250.00;}
      if (motorizzazione.equals("elettrico")) {return 200.00;}
      return 0;
   }
} 

