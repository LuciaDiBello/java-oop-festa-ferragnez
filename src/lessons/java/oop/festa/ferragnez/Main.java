package lessons.java.oop.festa.ferragnez;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Dichiarazione del vettore degli invitati
		String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		int n = invitati.length;  //lunghezza del vettore
	
		//Si definisce l'oggetto f della classe Festa
		//Si invoca il costruttore per inizializzare l'oggetto
		Festa f = new Festa (invitati, n);
		
		//Si acquisisce da tastiera il nome da cercare nella lista degli invitati
		System.out.print("Inserisci il nome da cercare: ");
		String nome = input.nextLine();
		System.out.println("Il nome inserito è: " + nome);
	       
		//Si invoca il metodo della classe per controllare se il nome è presente nella lista degli invitati
		//Il metodo restituisce un valore booleano
		boolean b = f.accetta(nome);
		if (b == true)
			   System.out.println("Trovato");
			else 
			   System.out.println("Non trovato");
	}
}

