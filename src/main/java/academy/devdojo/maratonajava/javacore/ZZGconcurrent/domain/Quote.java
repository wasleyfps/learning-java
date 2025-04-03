package academy.devdojo.maratonajava.javacore.ZZGconcurrent.domain;

// storeName:price:discountCode
public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;
    
    private Quote(String store, double price, Discount.Code discountCode) {
        super();
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }
    
    

    /**
     * Creates new Quote object from the value following the pattern storeName:price:discountCode
     * @param value contains storeName:price:discountCode
     * @return new Quote with value from @param value 
     */
    public static Quote newQuote(String value) {
        String[] split = value.split(":");
        return new Quote(split[0], Double.parseDouble(split[1]), Discount.Code.valueOf(split[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}