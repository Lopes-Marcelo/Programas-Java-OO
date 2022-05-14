public class Principal {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Marcelo");

        p2.setCurso("Engenharia de software");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        /*p1.receberAum(550);
        p2.mudarTrabalho();
        p3.cancelarMatri();*/ // Nenhum desses comandos é possível!

        System.out.println(p1.getNome().toString()); //É possível a construçção de um toString em cada classe pra informar o status e atributos dos objetos criados em cada uma delas.
        System.out.println(p2.getNome().toString());
        System.out.println(p3.getNome().toString());
        System.out.println(p4.getNome().toString());

    }
}
