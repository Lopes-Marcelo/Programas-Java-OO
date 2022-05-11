public class Pessoa {
    
    //Atributos

    private String nome;
    private int idade;
    private String sexo;

    //Métodos Públicos

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

    //Métodos Especiais

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

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

    public String getsexo(){
        return this.sexo;
    }

    public void setsexo(String sexo){
        this.sexo = sexo;
    }
    
}
