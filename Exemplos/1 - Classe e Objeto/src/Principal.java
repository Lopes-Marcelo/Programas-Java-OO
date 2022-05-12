public class Principal {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 85;
        c1.modelo = "Bic";
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.carga = 75;
        c2.modelo = "moLin";
        c2.status();
        c2.rabiscar();

    }
}
