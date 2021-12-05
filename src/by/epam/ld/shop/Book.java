package by.epam.ld.shop;

import java.util.Objects;

public class Book implements Goods {
    String name;
    int price;
    int pages;

    public Book() {

    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name, int price, int pages) {
        this.name = name;
        this.price = price;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && pages == book.pages && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, pages);
    }

    @Override
    public String toString() {
        return "Book: " + name + ", price: " + price + ", pages: " + pages;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }
}
