public class Principal {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro(21f, 5, 4, "Caramelo");
        Cobra c1 = new Cobra();
        c1.locomover();
        c.locomover();
    }
}
