public final class Tecnico extends Aluno {

    //Atributos

    private int registroProfissional;

    //Métodos Públicos

    public void praticar(){
        System.out.println("O aluno " + this.getNome() + " está praticando!");
    }

    //Métodos Especiais

    public int getregistroProfissional(){
        return this.registroProfissional;
    }

    public void setregistroProfissional(int registroProfissional){
        this.registroProfissional = registroProfissional;
    }
}
