package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class People {
    private String name;
    private String cpf;
    private Address address;

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
