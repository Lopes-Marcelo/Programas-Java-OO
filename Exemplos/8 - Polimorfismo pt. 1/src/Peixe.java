public abstract class Peixe extends Animal {
    
    //Atributos 

    private String corEscama;

    //Método Construtor

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public Peixe(){
        
    }

    //Métodos Abstratos

    public abstract void soltarBolha();

    //Métodos Especiais

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar(){
        System.out.println("Engolindo!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Sem som!");
    }
}
