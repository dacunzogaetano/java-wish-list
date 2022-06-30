package jana60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CicloWhile {
	
	/* Creare una classe Main con metodo main in cui implementare il seguente programma:
	Creare una lista dei desideri vuota e chiedere all’utente di aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
	Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri sono contenuti nella lista in quel momento.
	Al termine dell’inserimento stampare a video la lista ordinata.
	…poi, visto che siamo buoni ma non buonissimi, possiamo anche mettere un limite a quanti desideri può inserire una persona */

public static void main(String[] args) {
	//istanza dell'arraylist e dello scanner
	ArrayList<String> listaDesideri = new ArrayList<>();
	Scanner scelta = new Scanner(System.in);
	int sceltaValida=0;
	
	while (sceltaValida<5) {
		System.out.println("Premi 1 per inserire un nuovo desiderio o 2 per uscire");
	String inputScelta = scelta.nextLine();
	switch(inputScelta) {
	//scelta per aggiungere desideri
	case "1":
		System.out.println("Cosa vuoi aggiungere alla lista desideri?");
		listaDesideri.add(scelta.nextLine()); 
		System.out.println("La tua lista desideri è composta da  "+listaDesideri.size()+" desideri.");
		sceltaValida ++;
		break;
		
	//scelta per non aggiungere più desideri
	case "2":
		System.out.println("Hai deciso di non aggiungere più nulla alla tua lista.");
		sceltaValida=6;
		break;
	//scelta per chi non mette ne 1 ne 2
	default:
		System.out.println("Scelta non corretta, inserisci o 1 o 2");
		sceltaValida=0;
		break;
	}
	
	} 
	
	
	//ordine alfabetico per i regali e stampa della lista
			if(listaDesideri.size()>0) {
			Collections.sort(listaDesideri);
			System.out.println("La tua lista desideri ordinata: "+listaDesideri);
			}
			else {
				System.out.println("Non hai inserito nemmeno un desiderio.");
			}
	scelta.close();
}


}
