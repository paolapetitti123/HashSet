/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhashset;
import java.util.Objects;

/**
 *
 * @author Paola
 */
public class Book implements Comparable<Book>{
    private int paper; 
    private String author;
    private String title;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.paper != other.paper) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Book o) {
    return this.paper - o.paper;
}    
    
    public Book (int p, String a, String t) {
        this.paper = p;
        this.author = a;
        this.title = t; 
    }
    @Override
    public String toString() {
        return "Author: " + author + ", Title: " + title + ", with " + paper + " pages.";  
    }
}
