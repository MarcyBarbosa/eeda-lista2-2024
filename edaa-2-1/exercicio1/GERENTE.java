public class GERENTE extends Funcionarios {
    
    public GERENTE(String nome, int id, double salario) {
    
        super(nome, id, salario);
    
    }

    @Override
    public double calcularSalario(double salario) {
            
        return (salarioBase * 0.20) + salarioBase + 1000;
                
    }
}
