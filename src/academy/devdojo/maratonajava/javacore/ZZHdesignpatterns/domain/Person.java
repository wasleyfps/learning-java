package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    public Person(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String userName;
        private String email;
        
        public PersonBuilder(){
            
        }
        
        public static PersonBuilder builder(){
            return new PersonBuilder();
        }
        
        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        
        public PersonBuilder userName(String userName){
            this.userName = userName;
            return this;
        }
        
        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }
        
        public Person build(){
            return new Person(firstName, lastName, userName, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }
}
