package org.learning.java.library;

public class Book {
  private String title;
  private int pages;
  private String author;
  private String editor;
  
  public Book(String title, int pages, String author, String editor) throws RuntimeException {
    if (title != null && !title.isEmpty() && pages > 0 && author!= null && !author.isEmpty() && editor!= null && !editor.isEmpty())  {
    this.title = title;
    this.pages = pages;
    this.author = author;
    this.editor = editor;
    }
    else throw new RuntimeException("Il titolo e il numero di pagine, l'autore e l'editor sono obbligatori.");
  }
  
 
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) throws RuntimeException {
    if (title != null && !title.isBlank()) {
      this.title = title;
      
    }
  }
  
  public int getPages() {
    return pages;
  }
  
  public void setPages(int pages) throws RuntimeException {
    if (pages > 0) {
      this.pages = pages;
    }
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setAuthor(String author) {
    if (author != null && !author.isBlank()) {
      this.author = author;
    }
  }
  
  public String getEditor() {
    return editor;
  }
  
  public void setEditor(String editor) {
    if (editor != null && !editor.isBlank()) {
      this.editor = editor;
    }
  }
  
  @Override
  public String toString() {
    return "Libro {" + "titolo= " + title + ", pagine= " + pages + ", autore= " + author+ ", editor= " + editor + "}";
  }
  
}
