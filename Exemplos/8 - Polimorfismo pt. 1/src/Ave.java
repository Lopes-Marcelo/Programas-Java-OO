public abstract class Ave extends Animal {
    
    //Atributos 

    private String corPena;

    //Método Construtor

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public Ave(){
        
    }

    //Métodos Abstratos

    public abstract void fazerNinho();

    //Métodos Especiais

    public String getCorPena(){
        return this.corPena;
    }

    public void setCorEscama(String corPena){
        this.corPena = corPena;
    }

    @Override
    public void locomover(){
        System.out.println("Voando!");
    }

    @Override
    public void alimentar(){
        System.out.println("Bicando!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Ave!");
    }
}
