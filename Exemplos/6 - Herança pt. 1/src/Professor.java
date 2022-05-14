public class Professor extends Pessoa {
    
    //Atributos 

    private String especialidade;
    private float salario;

    //Métodos Públicos

    public void receberAum(float aum){
        this.salario += aum;
    }

    // Métodos Especiais

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

}
