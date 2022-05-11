public abstract class Pessoa {

    //Atributos 

    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    //Método Contrutor

    public Pessoa(String nome, int idade, String sexo){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;

    }

    //Métodos Especiais

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public float getExperiencia(){
        return this.experiencia;
    }

    public void setExperiencia(float experiencia){
        this.experiencia = experiencia;
    }

    //Métodos Abstratos

    protected abstract void ganharExp();
    
    @Override
    public String toString(){
        return "Aluno: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nExperiência: " + experiencia;
    }
}
