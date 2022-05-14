public final class Cachorro extends Mamifero {
    
    //Método Construtor

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public Cachorro(){
        
    }

    //Métodos Abstratos

    @Override
    public void emitirSom(){
        System.out.println("Latindo...");
    }

    //Métodos Públicos 

    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }
}
