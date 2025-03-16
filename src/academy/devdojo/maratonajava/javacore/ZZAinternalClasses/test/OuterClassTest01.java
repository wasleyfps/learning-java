package academy.devdojo.maratonajava.javacore.ZZAinternalClasses.test;

public class OuterClassTest01 {
    private String name = "Saitama";
    // Nested
    public class Inner {
        public void printOuterClassAttributes(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest01.this);
        }
    }
    
    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassTest01().new Inner();
        inner.printOuterClassAttributes();
        inner2.printOuterClassAttributes();
        
    }
}
