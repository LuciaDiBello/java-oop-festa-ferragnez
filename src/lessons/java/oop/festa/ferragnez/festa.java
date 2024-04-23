package lessons.java.oop.festa.ferragnez;

//Definizione della classe Festa
//La classe è composta da un campo array di stringhe contenente l'elenco degli invitati,
//da un campo intero (lunghezza del vettore) e da un metodo che permette di verificare 
//se il nome inserito dall'utente è presente nella lista
public class Festa {
  //campi
  public String[] invitati;
  public int n; //lunghezza del vettore
  //costruttore
  public Festa (String[] invitati, int n) {
	    this.n=n;
	    this.invitati = new String[this.n];
	    this.invitati = invitati; 
   }
//Metodo
//Verifica se il nome passato come parametro è presente nel vettore degli invitati
//e restituisce un booleano 
 public boolean accetta (String nome){
	    boolean trovato = false;
		    for(int i=0; i < this.n; i++) {
			     if (nome.equals(this.invitati[i])) {  //si usa il metodo equals per confrontare le due stringhe
		                 trovato = true; 
		                 break;   //se il nome è presente nell'array si interrompe l'esecuzione del ciclo for
		               }
		   }
	    return trovato;
 }
}

