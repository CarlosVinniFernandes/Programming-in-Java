public class Animal {
    private String nome;
    private int idade;
    private String tipo;

    public Animal(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void emitirSom(String som) {
        if ("cachorro".equals(tipo.toLowerCase())) {
            System.out.println("Auauau");
        } 
        else if ("gato".equals(tipo.toLowerCase())) {
                System.out.println("Miau");
            } 
        else {
                System.out.println(som);
            }
    }

    public void aniversario() {
        this.idade += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}