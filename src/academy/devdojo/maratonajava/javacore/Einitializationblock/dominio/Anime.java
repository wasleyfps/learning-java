package academy.devdojo.maratonajava.javacore.Einitializationblock.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }
    
    public Anime(String nome){
        this.nome = nome;
    }
    
    public Anime() {
        for(int episodio : this.episodios) {
            System.out.print(episodio + " ");
        };
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
    
}
