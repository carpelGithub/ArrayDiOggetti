

public abstract class Moto {
 private String modello;
 protected int cilindrata;
 protected String motorizzazione;
 
   public Moto(String modello, int cilindrata, String motorizzazione) {
        this.modello = modello;
        this.motorizzazione = motorizzazione;
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getMotorizzazione() {
        return motorizzazione;
    }

    public void setMotorizzazione(String motorizzazione) {
        this.motorizzazione = motorizzazione;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    abstract public double sconto();
    public String toString(){
        return "Modello: " + modello + "; Cilindrata:" + cilindrata + 
               "; Motorizzazione: "+ motorizzazione+"; Sconto:"+sconto()+"€";
    }
} 

