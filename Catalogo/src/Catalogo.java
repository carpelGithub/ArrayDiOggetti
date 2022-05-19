public class Catalogo {

// Attributi
 private static final int MAX_MOTO=50;
 private Moto modelli[];
 
 //costruttore
 public Catalogo() {
  modelli=new Moto[MAX_MOTO];
 }

// Metodi
 public int aggiungiMoto(Moto moto) {
  int i;
  for (i=0;i<MAX_MOTO;i++){
      if (modelli[i]==null){
          modelli [i]=moto;
          return i;
      }
   }
   return -1;
  }
 
 public int rimuoviMoto(String modello) {
  int i;
  for (i=0;i<MAX_MOTO;i++){
      if (modelli[i]!=null){
          if (modelli[i].getModello().equals(modello)){
             modelli [i]=null;
             return i;
          }
       }
  }
  return -1;
 } 
 
 public Moto[] elencoCatalogo() {
  int i,j=0, contaMoto=0;   
  for (i=0;i<MAX_MOTO;i++){
     if (modelli[i]!=null){
         contaMoto++;}
  }
  
  Moto[] inventario=new Moto[contaMoto];
  for (i=0;i<MAX_MOTO;i++){
     if (modelli[i]!=null){
         inventario[j]=modelli[i];
         j++;
     }
  }
  return inventario;
 }

 public static void main (String[] args){
     int i;
     Catalogo c1=new Catalogo();
     Scooter sc1= new Scooter("Px25", 250, "quattro tempi","medio","18 pollici");
     Scooter sc2= new Scooter("Px15", 150, "quattro tempi","medio","18 pollici");
     Scooter sc3= new Scooter("Px05", 50, "due tempi","piccolo","16 pollici");
     Stradale st1=new Stradale("St500", 500, "quattro tempi","naked");
     Stradale st2=new Stradale("St600", 600, "quattro tempi","cupolino");
     c1.aggiungiMoto(st1);
     c1.aggiungiMoto(sc1);
     c1.aggiungiMoto(sc2);
     c1.aggiungiMoto(st2);
     c1.aggiungiMoto(sc3);
     Moto[] inventario=c1.elencoCatalogo();
     for (i=0; i<inventario.length;i++){
         System.out.println(inventario[i].toString());
     }
 }
} 

