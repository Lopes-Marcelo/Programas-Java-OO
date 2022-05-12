public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.setModelo("BIC");
        //c1.modelo = "BIC"; apesar de chamar pelo método poderia ser chamado também pelo atributo diretamente pois o mesmo é público. OBS: Se for chamado por ambos a prioridade é da chamada direto no atributo.

        c1.setPonta(0.7f);

        c1.setTampada(false);

        c1.status();

        c1.rabiscar();
        
        
        //System.out.println("Tenho uma caneta " + c1.modelo + " de ponta " + c1.getPonta());

        //Com a utilização do método constructor, é possível a criação de objetos com atributos pré determinados que assim que chamados mostrarão valor pré estabelicidos e não "Null" e que podem, ou não, serem modificados mediante uso de métodos get e set de acordo com a necessidade do programador. Nesse projeto é possível ver isso nos atributos cor e tampada.
    }   
}
