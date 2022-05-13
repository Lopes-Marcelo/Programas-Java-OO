public class Principal {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Marcelo", "Brasil" , 24, 1.81f, 81.6f, 12, 2, 1);

        l[1] = new Lutador("Erick", "França", 28, 1.72f, 78.4f, 10, 6, 0);

        l[2] = new Lutador("Samuel", "EUA", 32, 1.92f, 70f, 9, 1, 2);

        l[3] = new Lutador("Gustavo", "Inglaterra", 33, 1.84f, 98.3f, 7, 0, 3);

        l[4] = new Lutador("André", "Jamaica", 22, 1.52f, 63.7f, 16, 7 ,1);

        l[5] = new Lutador ("Boca", "Nova Zelândia", 29, 2.02f, 100.4f, 20, 0, 0);
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
        l[0].status();
        l[1].status();
        
        
        /*l[3].empatarLuta();
        l[3].setPeso(10f); // Posso alterar por meio dos sets pois são públicos.
        l[3].status();
        l[3].apresentar();*/
    }
}
