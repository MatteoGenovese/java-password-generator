package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	/*
	 * Ciao Ragazzi e Ragazze,
		esercizio di oggi è un (insicurissimo) Password Generator
		nome del repo: java-password-generator
		Create un nuovo progetto java chiamato java-password-generator
		Aggiungete un package org.generation.italy.security
		Aggiungete una classe PasswordGenerator che contiene un metodo main
		Il programma deve fare quanto segue:
		salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
		generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
		Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
		La sua password sarà Pinco-Pallo-magenta-2011
		Buon lavoro :faccia_leggermente_sorridente:
	 * */
	
	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner
		
		System.out.print("nome: ");
        String name = scanner.nextLine(); 

        
		System.out.print("cognome: ");
        String surname = scanner.nextLine(); 

        
		System.out.print("colore: ");
        String favouriteColor = scanner.nextLine(); 

        
		System.out.print("giorno: ");
        int day = scanner.nextInt(); 
        
		System.out.print("mese: ");
        int month = scanner.nextInt(); 

        
		System.out.print("anno: ");
        int year = scanner.nextInt(); 
        
        int addDayMonthYear = day + month + year;
System.out.println(name+"-"+surname+"-"+favouriteColor+"-"+Integer.toString(addDayMonthYear));

        
		
	}

}
