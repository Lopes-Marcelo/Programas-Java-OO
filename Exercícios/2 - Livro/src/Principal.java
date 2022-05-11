public class Principal {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Marcelo", 24 , "Masculino");
        p[1] = new Pessoa("Nathaly", 26 , "Feminino");
        
        l[0] = new Livro("Auto da Compadecida", "Ariano Suassuna", 166 , p[0]);
        l[1] = new Livro("Vidas Secas", "Graciliano Ramos", 201 , p[0]);
        l[2] = new Livro("Harry Potter", "Jk Roling", 345, p[1]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());

    }
}
