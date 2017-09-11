/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_2;

/**
 *
 * @author Admin
 */
public class View {

    public static void main(String[] args) {
        Author author = new Author("mỹ", "hvm@gmail.com", "f");
        Book book = new Book("abc", author, 29.95, 0);
        System.out.println("author name: " + book.getAuthor().getName());
        System.out.println("author email: " + book.getAuthor().getEmail());
        System.out.println("2-----------");
        System.out.println(book.getAuthorName());
    }

}
