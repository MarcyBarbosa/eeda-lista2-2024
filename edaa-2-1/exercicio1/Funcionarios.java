public abstract class Funcionarios{
    public String nome;
    public int id;
    public double salario;
    public double salarioBase = 1412;

    public Funcionarios(String nome, int id, double salario){
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
    
    public abstract double calcularSalario(double salario);

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}