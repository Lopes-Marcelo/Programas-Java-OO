public abstract class Animal {

    //Atributos
    
    protected float peso;
    protected int idade;
    protected int membros;

    //Método Construtor 

    public Animal(float peso, int idade, int membros){

        this.peso = peso;
        this.idade = idade;
        this.membros = membros;

    }

    public Animal(){
        
    }

    //Métodos Abstratos

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //Métodos Especiais

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getMembros(){
        return this.membros;
    }

    public void setMembros(int membros){
        this.membros = membros;
    }
}
