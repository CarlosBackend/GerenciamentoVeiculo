import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        System.out.println("Insira os dados do Carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Ano: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Quantidade de Portas: ");
        int quantidadePortas = scanner.nextInt();
        scanner.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro,anoCarro,quantidadePortas);
        veiculos.add(carro);

        System.out.println("\nInsira os dados da Moto");
        System.out.println("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.println("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.println("Ano: ");
        int anoMoto = scanner.nextInt();
        System.out.println("Cilindrada: ");
        int cilindradaMoto = scanner.nextInt();
        Moto moto = new Moto(marcaMoto,modeloMoto,anoMoto,cilindradaMoto);
        veiculos.add(moto);

        System.out.println("\nDetalhes dos veiculos");
        for (Veiculo veiculo: veiculos)
        {
            veiculo.exibirDetalhes();
        }
        scanner.close();
    }
}
