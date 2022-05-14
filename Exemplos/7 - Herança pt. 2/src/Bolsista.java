public final class Bolsista extends Aluno {
    
    //Atributos

    private float bolsa;

    //Métodos Públicos

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.getNome() + "!");
    }

    @Override
    public final void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista, pagamento não necessário!");
    }

    //Métodos Especiais

    public float getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

}
