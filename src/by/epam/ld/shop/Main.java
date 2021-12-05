package by.epam.ld.shop;

public class Main {

    public static void main(String[] args) {

        Book b = new Book("SomeBook", 100);
        Bookmark bm = new Bookmark("SomeBookMark", 10, "Colored");
        ChristmasTree ct = new ChristmasTree("SomeChristmasTree", 1000, "Small", "White");
        FlowerPot fp = new FlowerPot("SomeFlowerPot", 50, "Long");
        Refrigerator r = new Refrigerator("SomeRefrigerator", 10000, 100*360);

        System.out.println("Receipt #1:\n");
        printCheck(b);
        printCheck(bm);
        printCheck(ct);
        printCheck(fp);
        printCheck(r);

        int total = b.getPrice()+bm.getPrice()+ ct.getPrice()+fp.getPrice()+r.getPrice();

        System.out.println("\nTotal: " + total + ".");
    }

    public static void printCheck(Goods goods){
        System.out.println(""+goods.name()+", price: "+goods.price() + ".");
    }
}
