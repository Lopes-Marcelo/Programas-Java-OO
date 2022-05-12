public class Caneta {
    
    // Atributos
    
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    // Método Construtor

    public Caneta() { //Este é o método construtor.
        this.tampar();
        this.cor = "Azul";
    }

    // Métodos Públicos

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.getTampada());
    }
    
    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }

        else{
            System.out.println("Posso rabiscar!");
        }
    }

    // Métodos Especiais

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }
}
