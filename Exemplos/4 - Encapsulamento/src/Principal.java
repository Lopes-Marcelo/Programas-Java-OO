public class Principal {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.menosVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu(); 
    }
}
