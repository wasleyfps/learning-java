package academy.devdojo.maratonajava.javacore.ZZinternalClasses.test;

import java.sql.SQLOutput;

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
