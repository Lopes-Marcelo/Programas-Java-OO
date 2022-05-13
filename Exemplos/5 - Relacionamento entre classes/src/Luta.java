import java.util.Random;

public class Luta {
    
    //Atributos

    private Lutador desafiado;
    private Lutador desafiante; // Atributo oriundo de uma classe.
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } 
        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("CHEGOU A HORA! A mais aguardada luta vai acontecer!");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor){
                case 0: //Empate
                    System.out.println("-------ITS TIME------");
                    System.out.print("Resultado da luta: ");
                    System.out.println("empate, os jurados foram unânimes!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: //Desafiado vence
                    System.out.println("-------ITS TIME------");
                    System.out.print("Resultado da luta: ");
                    System.out.println("vitória do " + desafiado.getNome() + "!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: //Desafiante vence
                    System.out.println("-------IT´S TIME------");
                    System.out.print("Resultado da luta: ");
                    System.out.println("vitória do " + desafiante.getNome() + "!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        }
        else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    //Métodos Especiais

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
}