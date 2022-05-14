public final class Canguru extends Mamifero {
    
    //Método Construtor

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public Canguru(){
        
    }
    
    //Métodos Abstratos

    @Override
    public void locomover(){
        System.out.println("Saltando!");
    }

    //Métodos Públicos

    public void usarBolsa(){
        System.out.println("Usando bolsa...");
    }
}
