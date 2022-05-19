import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Autonoleggio {

    Auto [] a;
    int t;

    public Autonoleggio() {
        try {
        Scanner s  = new Scanner(System.in);
        System.out.println("Inserisci quanti posti vuoi che abbia il tuo autonoleggio");
        t=s.nextInt();
        a = new Auto[t];
        for(int i= 0; i<t; i++) {
            a[i] = new Auto();
        }
    }
    catch(InputMismatchException e) {
            System.out.println("Errore ritenta");
    }

    }

    public void aggiungiAuto(int k) {
        try {
            Scanner c  = new Scanner(System.in)    ;


                System.out.println("inserisci targa");
                a[k].setTarga(c.next());
                System.out.println("Inserisci Marca");
                a[k].setMarca(c.next());
                System.out.println("Inserisci Modello");
                a[k].setModello(c.next());

        }catch(IndexOutOfBoundsException e){
            System.out.println("tutti i posti auto sono pieni");

        }catch(NullPointerException e) {
            System.out.println("Il posto e vuoto ed non e possibile aggiungere");
        }

    }

    public void Cancellaxposto(int k) {
        try {

            if(a[k]!= null) {

                a[k]=new Auto();
        }
}catch(IndexOutOfBoundsException e) {
            System.out.println("Il posto selezionato e' oltre i posti disponibili");

    }
    }
    public void Cancellaxtarga(String ta) {

        for(int i = 0; i<t; i++) {
            if(a[i].getTarga()==ta) {

                a[i]=new Auto();
    }
    }



    }

    public void CancellaAuto(Auto b) {

        for(int i = 0; i<t; i++) {

            a[i]=new Auto();
    }
    }

    public void Sostituisci(int k,Auto b) {

    try {
        a[k]=b;
    }catch(IndexOutOfBoundsException e) {

        System.out.println("Il posto selezionato e' oltre i posti disponibili");
    }catch(NullPointerException e) {
        System.out.println("Il posto e vuoto ed non e possibile aggiungere");
    }


    }







    public void stampa() {

        System.out.print(Arrays.toString(a));

    }


}
