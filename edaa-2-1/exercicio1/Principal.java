import java.util.Scanner;

public class Principal{
    private static double salario;

    public static void main(String[] args){
        Empresa empresa = new Empresa();

        // Leitura dos dados e criação de funcionários
        lerDadosFuncionario(empresa);

        // Cálculo da folha salarial
        double folhaSalarial = empresa.calcularFolhaSalarial();
        System.out.println("Total da Folha salarial : R$ " + folhaSalarial);
    }

    public static void lerDadosFuncionario(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome completo do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o ID do funcionário: ");
        int id = scanner.nextInt();

        System.out.println("Informe o cargo do funcionário (DESENVOLVEDOR/GERENTE/SUPORTE): ");
        String cargoS = scanner.next();
        Cargo cargo = Cargo.valueOf(cargoS.toUpperCase());

        // Criação do funcionário com base no cargo
        Funcionarios funcionario = null;
        switch (cargo) {
            case DESENVOLVEDOR:
                funcionario = new DESENVOLVEDOR(nome, id, salario);
                break;
            case GERENTE:
                funcionario = new GERENTE(nome, id, salario);
                break;
            case SUPORTE:
                funcionario = new SUPORTE(nome, id, salario);
                break;
            default:
                System.out.println("Cargo inválido.");
                scanner.close();
                return;
        }
        scanner.close();
        // Adição do funcionário à empresa
        empresa.adicionarFuncionario(funcionario);
        System.out.println("Funcionário adicionado com sucesso.\n");
        
    }
}
