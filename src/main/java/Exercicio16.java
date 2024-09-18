
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        double n1, n2;
        int calculo;
        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextDouble();
        System.out.println("Selecione uma das opções\n [1] - Adição\n [2] - Subtração\n [3] - Divisão\n [4] - Multiplicação");
        calculo = leitor.nextInt();
        switch (calculo) {
            case 1:
                System.out.printf("O resultado é %f", n1 + n2);
                break;
            case 2:
                System.out.printf("O resultado é %f", n1 - n2);
                break;
            case 3:
                if (n2 == 0) {
                    System.out.println("Impossível calcular!");
                    break;
                } else {
                    System.out.printf("O resultado é %f", n1 / n2);
                    break;
                }
            case 4:
                System.out.printf("O resultado é %f", n1 * n2);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
