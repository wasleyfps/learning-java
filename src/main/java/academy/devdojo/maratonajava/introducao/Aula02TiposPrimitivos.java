package academy.devdojo.maratonajava.introducao;

import javax.lang.model.element.VariableElement;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long e boolean
        int age = 26;
        long numberLong = 100000L; // -9223372036854775808 a 9223372036854775807
        double salaryDouble = 2000.0; // 1.7E-308 a 1.7E+308
        float salaryFloat = 2500.0F; // 3.4E-038 a 3.4E+038
        byte ageByte = 127; // -128 a 127
        short ageShort = 32000; // -32768 a 32767
        boolean isTrue = true;
        boolean isFalse = false;
        char character = 'W'; // 2 bytes
        
        String name = "Wasley Carvalho";
        System.out.println(name);
        System.out.println(age);
        System.out.println(character);
    }
}
