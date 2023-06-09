package org.learning.java.library;

import java.util.Scanner;

public class Library {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Benvenuto in Libreria \n Inserisci nel carrello i libri che vuoi");
    System.out.println("Quanti libri vuoi?");
    int nLibri = Integer.parseInt(scanner.nextLine());
    Book[] books = new Book[nLibri];
    
    for (int i = 0; i < nLibri; i++) {
      
      System.out.println("Inserisci il titolo del libro");
      String title = scanner.nextLine();
      
      boolean validPages = false;
      int pages = 0;
      while (!validPages) {
        try {
          System.out.println("Inserisci il numero di pagine del libro");
          pages = Integer.parseInt(scanner.nextLine());
          validPages = true;
        } catch (NumberFormatException e) {
          System.out.println("Errore: Inserisci un numero valido per le pagine.");
        }
      }
//      System.out.println("Inserisci il numero di pagine del libro");
//      int pages = Integer.parseInt(scanner.nextLine());
      System.out.println("Inserisci l'autore del libro");
      String author = scanner.nextLine();
      System.out.println("Inserisci l'editore del libro");
      String editor = scanner.nextLine();
      
      try {
        books[i] = new Book(title, pages, author, editor);
      System.out.println("libro : " + (i+1) + " inserito correttamente");
      }
      catch (NumberFormatException e) {
        System.out.println("Errore: " + e.getMessage());
        i--;
      }
      catch (IllegalArgumentException e) {
        System.out.println("Errore: " + e.getMessage());
        i--;
      }
//      books[i] = new Book(title, pages, author, editor);
    }
    System.out.println("Il tuo carrello:");
    for (Book book : books) {
      System.out.println(book.toString());
    }
  }
}
