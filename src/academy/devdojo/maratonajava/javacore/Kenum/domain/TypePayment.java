package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypePayment {
        DEBIT{
            @Override
            public double calculateDiscount(double value) {
                return value * 0.1;
            }
        }, CREDIT{
            @Override
            public double calculateDiscount(double value) {
                return value * 0.05;
            }
        };
    
    public abstract double calculateDiscount(double value);
}