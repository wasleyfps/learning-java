package academy.devdojo.maratonajava.javacore.ZZinternalClasses.test;

public class OuterClassTest02 {
    private String name = "Saitama"; 
    
    void print(){
        final String lastName = "Genos";
        class LocalClass{
            public void printLocal(){
                System.out.println();
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    
    public static void main(String[] args) {
        OuterClassTest02 outerClassTest02 = new OuterClassTest02();
        outerClassTest02.print();
    }
}
