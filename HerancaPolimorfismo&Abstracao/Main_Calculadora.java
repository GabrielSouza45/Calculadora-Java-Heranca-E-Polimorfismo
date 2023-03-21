import java.util.Scanner;

public class Main_Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) { // for para testar as 4 perações sem interrupção

            Calculo multiplicar = new Multiplicar();
            Calculo dividir = new Dividir();
            Calculo somar = new Somar();
            Calculo subtrair = new Subtrair();

            System.out.println("Digite o primeiro valor: ");
            double x = sc.nextDouble();

            System.out.println("Digite o segundo valor: ");
            double y = sc.nextDouble();

            System.out.println("Digite a operação requerida:  ");
            System.out.println(" X - Multiplicação ");
            System.out.println(" / - Divisão ");
            System.out.println(" + - Soma ");
            System.out.println(" - - Subtração ");

            String escolha = sc.next().toUpperCase();

            switch (escolha) {

                case "X":

                    System.out.println("A multiplicação de " + x + " x " + y + " = " + multiplicar.calcular(x, y));
                    break;

                case "/":

                    if ( y != 0 ){
                        System.out.println("A divisão de " + x + " / " + y + " = " + dividir.calcular(x, y));
                        break;
                    } else {
                        System.out.println( "Impossível dividir por zero! 0!" );
                        break;
                    }
                    
                case "+":

                    System.out.println("A soma de " + x + " + " + y + " = " + somar.calcular(x, y));
                    break;

                case "-":

                    System.out.println("A subtração de " + x + " - " + y + " = " + subtrair.calcular(x, y));
                    break;

                default :
                    System.out.println("Digite um caracter válido.");
                
            }
        }
        sc.close();
    }
    
}
