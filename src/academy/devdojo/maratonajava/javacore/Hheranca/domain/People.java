package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class People {
    protected String name;
    protected String cpf;
    protected Address address;
    
    static{
        System.out.println("Dentro do bloco de inicialização estático de People");
    }
    
    {
        System.out.println("Dentro do bloco de inicialização de People 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de People 2");
    }
    
    public People(String name) {
        System.out.println("Dentro do construtor de People");
        this.name = name;
    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Rua: " + this.address.getStreet());
        System.out.println("CEP: " + this.address.getPostcode());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
