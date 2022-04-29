package libraries;

import books.Book;
import checkouts.ScienceFictionCheckout;
import checkouts.BiographyCheckout;
import interfaces.IFiction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library implements IFiction {

    List<Book> books;
    List<IFiction> fictions;
    protected LinkedList<ScienceFictionCheckout> sciFiCheckOuts = new LinkedList<>();
    protected LinkedList<BiographyCheckout> bioCheckOuts = new LinkedList<>();

    public Library() {
        this.books = new ArrayList<>();
        this.fictions = new ArrayList<>();
    }

    @Override
    public boolean isFuturistic() {
        return false;
    }

     public void addBook(Book book) {
        this.books.add(book);
     }

     public List<Book> getBooks() {
        return this.books;
     }

     public void addSciFiCheckOut(ScienceFictionCheckout sciFiCheckOut) {
        this.sciFiCheckOuts.add(sciFiCheckOut);
     }

    public void addBioCheckOut(BiographyCheckout bioCheckOut) {
        this.bioCheckOuts.add(bioCheckOut);
    }

     public LinkedList<ScienceFictionCheckout> getSciFiCheckOut() {
        return sciFiCheckOuts;
     }

     public LinkedList<BiographyCheckout> getBioCheckOut() {
        return bioCheckOuts;
    }

    public void addFiction(IFiction fiction) {
        fictions.add(fiction);
    }

    public List<IFiction> getFiction() {
        return this.fictions;
    }






}
