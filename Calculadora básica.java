import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do{
            System.out.println("|===================|");
            System.out.println("|====CALCULADORA====|");
            System.out.println("|===================|");
            System.out.println("|  1. SOMA          |");
            System.out.println("|  2. SUBTRAÇÃO     |");
            System.out.println("|  3. MULTIPLICAÇÃO |");
            System.out.println("|  4. DIVISÃO       |");
            System.out.println("|  5. RAIZ          |");
            System.out.println("|  6. POTENCIA      |");
            System.out.println("|===================|");

            System.out.println("|ECOLHA UMA OPERAÇÃO|");
            System.out.println("|===================|");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("informe o número que deseja somar");
                    double s1 = scanner.nextDouble();

                    System.out.println("informe outro número que deseja somar");
                    double s2 = scanner.nextDouble();

                    double s3 = s1 + s2;
                    System.out.println("a soma de " + s1 + " com " + s2 + " é igual a " + s3);
                    break;
                case 2:
                    System.out.println("informe o número que deseja ");
                    double sub1 = scanner.nextDouble();

                    System.out.println("informe outro número que deseja ");
                    double sub2 = scanner.nextDouble();

                    double sub3 = sub1 - sub2;
                    System.out.println("a subtração de " + sub1 + " com " + sub2 + " é igual a " + sub3);
                    break;
                case 3:
                    System.out.println("informe o número que deseja ");
                    double m1 = scanner.nextDouble();

                    System.out.println("informe outro número que deseja ");
                    double m2 = scanner.nextDouble();

                    double m3 = m1 * m2;
                    System.out.println("a multiplicação de " + m1 + " com " + m2 + " é igual a " + m3);
                    break;
                case 4:
                    System.out.println("informe o número que deseja ");
                    double d1 = scanner.nextDouble();

                    System.out.println("informe outro número que deseja ");
                    double d2 = scanner.nextDouble();

                    double d3 = d1 / d2;
                    System.out.println("a divisão de " + d1 + " com " + d2 + " é igual a " + d3);
                    break;
                case 5:
                    System.out.println("diga um número: ");
                    double raiz = scanner.nextDouble();

                    double raiz2 = Math.sqrt(raiz);
                    DecimalFormat df = new DecimalFormat("#0.00");
                    String rf = df.format(raiz2);
                    System.out.println("a raiz é "+rf);
                    break;
                case 6:
                    System.out.println("diga a base: ");
                    double pot = scanner.nextDouble();

                    System.out.println("diga o expoente: ");
                    double pot2 = scanner.nextDouble();

                    double potencia = Math.pow(pot, pot2);
                    System.out.println(pot + " elevado a "+pot2+" é igual a "+potencia);
                    break;
                case 0:
                    System.out.println("PROGRAMA ENCERRADO");
                    break;
                default:
                    System.out.println("OPERAÇÃO INVALIDA!");

            }
        } while(escolha != 0);
        scanner.close();
    }


}
