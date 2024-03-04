public class DESENVOLVEDOR extends Funcionarios{
    
    public DESENVOLVEDOR(String nome, int id, double salario) {
    
        super(nome, id, salario);
    
    }
    
    @Override    
    public double calcularSalario(double salario) {
            
        return (salarioBase * 0.10) + salarioBase;
    }
}
