package QuestionThree;

public class Morador {
    public String nome;
    private Integer telefone;
    private Integer numero;
    public Boolean dog;

    public Morador(String nome, Boolean dog, Integer telefone, Integer numero) {
        this.setNome(nome);
        this.setDog(dog);
        this.setTelefone(telefone);
        this.setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getDog() {
        return dog;
    }

    public void setDog(Boolean dog) {
        this.dog = dog;
    }

    private Integer getTelefone() {
        return telefone;
    }

    private void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    private Integer getNumero() {
        return numero;
    }

    private void setNumero(Integer numero) {
        this.numero = numero;
    }
    void status(){
        System.out.println("\nSeu nome: "+this.getNome());
        System.out.println("Numero da residencia: "+this.getNumero());
        System.out.println("Telefone: "+this.getTelefone());
    }
    void entrega(){
        if (this.dog==false){
            System.out.println("Entregamos em sua residencia");
        }else{
            System.out.println("Nao entregamos em sua residencia");
        }
    }
}

