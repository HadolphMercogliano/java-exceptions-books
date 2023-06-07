package org.learning.java.library;

public class Book {
  private String title;
  private int pages;
  private String author;
  private String editor;
  
  public Book(String title, int pages, String author, String editor) throws IllegalArgumentException {
    if (title != null && !title.isEmpty() && pages > 0 && author!= null && !author.isEmpty() && editor!= null && !editor.isEmpty())  {
    this.title = title;
    this.pages = pages;
    this.author = author;
    this.editor = editor;
    }
    else throw new IllegalArgumentException("Il titolo e il numero di pagine, l'autore e l'editor sono obbligatori.");
  }
  
 
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) throws IllegalArgumentException {
    if (title != null && !title.isEmpty()) {
      this.title = title;
    }else throw new IllegalArgumentException("Il titolo è obbligatorio.");
  }
  
  public int getPages() {
    return pages;
  }
  
  public void setPages(int pages) throws NumberFormatException {
    if (pages > 0) {
      this.pages = pages;
    }else throw new NumberFormatException("Il numero di pagine è obbligatorio.");
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setAuthor(String author) throws IllegalArgumentException {
    if (author != null && !author.isBlank()) {
      this.author = author;
    }else throw new NumberFormatException("L'autore è obbligatorio.");
  }
  
  public String getEditor() {
    return editor;
  }
  
  public void setEditor(String editor) throws IllegalArgumentException {
    if (editor != null && !editor.isBlank()) {
      this.editor = editor;
    }else throw new IllegalArgumentException("L'editor è obbligatorio.");
  }
  
  @Override
  public String toString() {
    return "Libro {" + "titolo= " + title + ", pagine= " + pages + ", autore= " + author+ ", editor= " + editor + "}";
  }
  
}
