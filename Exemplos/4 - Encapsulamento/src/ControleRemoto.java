public class ControleRemoto implements Controlador {
    
    //Atributos

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Método Construtor

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // Métodos Especiais

    private boolean getTocando(){
        return this.tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }
    
    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    //Métodos Abstratos
    
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println("-------MENU------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(40);
        }
    }

    @Override
    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }    
    }

    @Override
    public void pause(){
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
