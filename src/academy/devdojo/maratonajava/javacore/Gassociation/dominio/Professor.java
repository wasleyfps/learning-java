package academy.devdojo.maratonajava.javacore.Gassociation.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminary[] seminaries;
    
    public Professor(String nome) {
        this.nome = nome;
    }
    
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    // Overcharge constructor
    public Professor(String nome, String especialidade, Seminary[] seminaries) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminaries = seminaries;
    }
    
    public void imprime() {
        System.out.println("--------");
        System.out.println("Professor: " + this.nome);
        if (this.seminaries == null) return;
        System.out.println("## Seminários Cadastrados ##");
        for (Seminary seminary : seminaries) {
            System.out.println(seminary.getTitle());
            System.out.println(seminary.getLocal().getAddress());
            if (seminary.getStudents() == null || seminary.getStudents().length == 0) continue;
            System.out.println("Alunos: ");
            for (Student student : seminary.getStudents()) {
                System.out.println("Aluno: " + student.getName() + " Idade: " + student.getAge());
            }
        }
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
