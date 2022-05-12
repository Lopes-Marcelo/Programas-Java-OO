public class Caneta {
    
    // Atributos
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private Boolean tampada;
    
    // Métodos Públicos
    
    public void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        } 
        else {
            System.out.println("Estou apto à rabiscar!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}