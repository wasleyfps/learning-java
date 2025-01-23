package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1,0));
    }
    
    private static int division(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("The second parameter cannot be zero");
        }
        return a/b;
    }
}
