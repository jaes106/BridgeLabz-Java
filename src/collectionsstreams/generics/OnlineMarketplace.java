package collectionsstreams.generics;

abstract class ProductCategory {
    abstract String getCategoryName();
}

class BookCategory extends ProductCategory {
    String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory extends ProductCategory {
    String getCategoryName() {
        return "Clothing";
    }
}

class Product<T extends ProductCategory> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class OnlineMarketplace {

    static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }

    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        applyDiscount(book, 10);
        System.out.println(book.price);
    }
}

