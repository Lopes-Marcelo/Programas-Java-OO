public class Aluno extends Pessoa{

    //Atributos

    private int matricula;
    private String curso;

    //Métodos Públicos 

    public void cancelarMatri(){
        System.out.println("Matrícula cancelada!");
    }

    //Métodos Especiais

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    
}
