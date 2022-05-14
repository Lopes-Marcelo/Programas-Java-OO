public class Calculadora {

    // Sobrecarga

    public int calcula(int a, int b){
        return a + b;
    }

    public double calcula(double a, double b){
        return a + b;
    }

    public String calcula(String a, String b, String c){
        return a + b + c;
    }

    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();
        System.out.println(calc.calcula(1, 6));
        System.out.println(calc.calcula(2.7, 9.5));
        System.out.println(calc.calcula("Olá, ", "Mundo!" , " Aqui é Marcelo!"));
    }
}
