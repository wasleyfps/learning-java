package academy.devdojo.maratonajava.javacore.ZZAinternalClasses.test;

public class OuterClassTest03 {
    private String name =  "Wasley";
    static class Nested{
        private String lastName = "Carvalho";
        void print(){
            System.out.println(new OuterClassTest03().name + " " + this.lastName);
        }
    } 
    public static void main(String[] args) {
        new Nested().print();
        
    }
}
