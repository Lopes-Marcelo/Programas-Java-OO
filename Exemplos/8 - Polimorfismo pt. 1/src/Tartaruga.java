public final class Tartaruga extends Reptil {

    //Métodos Construtor
    
    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    public Tartaruga(){

    } 

    //Métodos Abstratos

    @Override
    public void locomover(){
        System.out.println("Andando lentamente...");
    }
   
}
