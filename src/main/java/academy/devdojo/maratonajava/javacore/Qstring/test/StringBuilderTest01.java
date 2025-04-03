package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Wasley Carvalho";
        name.concat(" Saitama");
        name = name.substring(0, 3);
        System.out.println(name);
        
        StringBuilder sb = new StringBuilder("Wasley Carvalho");
        sb.append(" Saitama").append(" Cê tá Doido");
        System.out.println(sb);
        
        StringBuffer sbf = new StringBuffer("Wasley Carvalho");
        sbf.append(" Saitama");
        System.out.println(sbf);
    }
}
