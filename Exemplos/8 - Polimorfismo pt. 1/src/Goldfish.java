public final class Goldfish extends Peixe {

    //Método Construtor

    public Goldfish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    
    //Métodos Abstratos

    public void soltarBolha(){
        System.out.println("Soltando bolha...");
    }
}
