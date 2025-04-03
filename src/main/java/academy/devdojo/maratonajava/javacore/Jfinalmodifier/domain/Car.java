package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public static final double limitSpeed=  250;
    
    public final Buyer buyer = new Buyer();
    // When you end up final in your variable, you cannot overwrite it
    
    public final void print(){
        System.out.println(this.name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
