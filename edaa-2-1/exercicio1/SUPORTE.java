public class SUPORTE extends Funcionarios{
    
    public SUPORTE(String nome, int id, double salario) {

        super(nome, id, salario);

    }

    @Override
    public double calcularSalario(double salario) {
        
       return (salarioBase * 0.05) + salarioBase;   
    }
}
