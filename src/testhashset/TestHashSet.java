/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhashset;
import java.util.*;

/**
 * @author Paola
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        
        System.out.println(set);
        
        for(String s: set) {
            System.out.println(s.toUpperCase() + " ");
        }
        
        Set<Book> set1 = new HashSet<>(); 
        
        Book[] books = { new Book(230, "David", "textbook1"), new Book(350, "Liang", "textbook2"),
                         new Book(500, "Joe", "textbook3"), new Book(500, "Joe", "textbook3")};
        
        for (Book s: set1) {
            System.out.println(s);
        }
        LinkedHashSet<Book> set2 = new LinkedHashSet(Arrays.asList(books));
        TreeSet<Book> set3 = new TreeSet(Arrays.asList(books)); 
        for (Book x: set3) {
            System.out.println(x); 
        }
    }
}
