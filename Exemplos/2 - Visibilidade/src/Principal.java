public class Principal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; // Privado, não posso chamar!
        c1.carga = 85; // É possível mexer porque está dentro de um método que utiliza a classe Caneta!
        //c1.tampada = false; // Privado, não posso chamar!
        c1.destampar(); // Apesar do atributo tampada ser privado, o método tampar é publico e chama o atributo tampada, sendo possível inserir ele no código.
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "preta";
        //c2.ponta = 0.7f; // Privado, não posso chamar!
        //c2.tampada = true; // Privado, não posso chamar!
        c2.carga = 75;
        c2.modelo = "moLin";
        c2.status();
        c2.rabiscar();

    }
}