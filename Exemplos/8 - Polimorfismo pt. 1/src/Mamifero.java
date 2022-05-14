public abstract class Mamifero extends Animal{
    
    //Atributos 

    private String corPelo;

    //Método Construtor 

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public Mamifero(){
        
    }


    //Métodos Especiais

    public String getCorPelo(){
        return this.corPelo;
    }

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar(){
        System.out.println("Mamando!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero!");
    }

}
