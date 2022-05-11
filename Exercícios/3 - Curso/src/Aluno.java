public class Aluno extends Pessoa {

    //Atributos

    private String login;
    private int totAssistido;

    //Método Construtor

    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;

    }

    //Métodos Especiais

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }
    
    public int getTotAssistido(){
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido){
        this.totAssistido = totAssistido;
    }

    //Métodos Abstratos
    
    @Override
    protected void ganharExp() {            //terminar aquiiiiiiiiiiiiiiii
        
    }

    @Override
    public String toString(){
        return "Aluno: " + nome + "\nLogin: " + login + "\nIdade: " + idade + "\nSexo: " + sexo + "\nExperiência: " + experiencia + "\nTotal Assistido: " + totAssistido;
    }

    //Métodos Públicos 

    public void viuMaisUm(){  //terminar aquiiiiiiiiiiiiiiiiiiiiiiii

    }
}
