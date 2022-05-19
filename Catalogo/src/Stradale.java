public class Stradale extends Moto {
 private String carena;

    public Stradale(String modello, int cilindrata, String motorizzazione, String carena) {
        super(modello, cilindrata, motorizzazione);
        this.carena = carena;
    }

    public String getCarena() {
        return carena;
    }

    public void setCarena(String carena) {
        this.carena = carena;
    }

   public double sconto(){
      int cc=0;
      if (cilindrata>250) {cc=cilindrata-250;}
      return 150+ (cc/10)*15;
   }
   public String toString(){
    return super.toString()+"; Carena:"+carena;
   }
} 



