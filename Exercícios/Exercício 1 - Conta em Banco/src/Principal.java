public class Principal {
    public static void main(String[] args) {
    ContaBanco p1 = new ContaBanco();
    p1.abrirConta("CC");
    p1.setNumConta(1111);
    p1.setDono("Marcelo");
    p1.depositar(300);
    p1.estadoAtual(); 
    
    ContaBanco p2 = new ContaBanco();
    p2.abrirConta("CP");
    p2.setNumConta(2222);
    p2.setDono("Nathaly");
    p2.depositar(500);
    p2.sacar(100);
    p2.estadoAtual();
    }
}


