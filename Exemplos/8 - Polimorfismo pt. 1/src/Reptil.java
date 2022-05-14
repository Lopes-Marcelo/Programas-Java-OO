public abstract class Reptil extends Animal {
    
    //Atributos 

    private String corEscama;

    //Método Construtor

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public Reptil(){
        
    }

    //Métodos Especiais

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Rastejando!");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil!");
    }
}
