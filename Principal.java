import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        Scanner scanner = new Scanner(System.in);

        caixaEletronico.setSaldo(2500);
        System.out.println("Seu saldo atual: R$" + caixaEletronico.getSaldo());

        int opcao = 0;
        double saldo = 0;
        while (opcao != 4) {
            System.out.println("""
                    Opções:
                    1- Consultar Saldo
                    2- Depositar
                    3- Sacar
                    4- Sair
                    """);

            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: " + caixaEletronico.getSaldo());
                    break;
                case 2:

                    System.out.println("Quanto gostaria de depositar?");
                    double depositar = scanner.nextDouble();

                    saldo = caixaEletronico.getSaldo() + depositar;
                    System.out.println("Seu novo saldo é: R$" + saldo);
                    break;
                case 3:

                    System.out.println("Quanto gostaria de sacar?");
                    double sacar = scanner.nextDouble();

                    saldo = caixaEletronico.getSaldo() + sacar;
                    System.out.println("Seu novo saldo é: R$" + saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }

            if (opcao > 4) {
                System.out.println("Opção indisponível, tente novamente!");
                break;
            }
        }

    }
}