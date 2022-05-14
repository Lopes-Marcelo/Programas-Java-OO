public final class Cobra extends Reptil {

    //Método Construtor

    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    public Cobra(){
        
    }

    //Métodos Abstratos

    @Override
    public void alimentar(){
        System.out.println("Sufocando...");
    }
    
}
