public class ProjetoVideo {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 - Introdução");
        v[1] = new Video("Aula 2 - Soma");
        v[2] = new Video("Aula 3 - Subtração");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Marcelo", 25 , "Masculino", "Celo_Lopes");
        a[1] = new Aluno("Nathaly", 26, "Feminino", "Natha_lindinha");

        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(a[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[0] = new Vizualizacao(a[0], v[1]);
        vis[0].avaliar(76.5f);
        System.out.println(vis[0].toString());

        /*System.out.println("VÍDEOS\n-------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nAlunos\n-----------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());*/
    }
}
