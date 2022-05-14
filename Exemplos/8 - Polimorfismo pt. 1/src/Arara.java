public final class Arara extends Ave {
    
    //Método Construtor

    public Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    //Métodos Abstratos

    @Override
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }
}
