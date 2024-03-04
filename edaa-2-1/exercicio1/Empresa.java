import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionarios> funcionarios;
    private double totalSalarios;

    public Empresa() {

        this.funcionarios = new ArrayList<>();

    }

    public void adicionarFuncionario(Funcionarios funcionario){

        funcionarios.add(funcionario);

    }

    public double calcularFolhaSalarial() {
        
        for (Funcionarios funcionario : funcionarios) {

            totalSalarios += funcionario.calcularSalario(funcionario.getSalario());

        }

        return totalSalarios;
        
    } 
}
