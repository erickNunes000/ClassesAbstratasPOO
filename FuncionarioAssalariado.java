public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;

    FuncionarioAssalariado(String nome, String matricula, double salarioSemanal){//falta definir construtor
        super(nome, matricula);
        this.salarioSemanal=salarioSemanal;
    }
    FuncionarioAssalariado(){

    }

    public double getSalarioSemana(){
        return this.salarioSemanal;
    }
    public void setSalarioSemanal(double salarioSemanal){
        this.salarioSemanal=salarioSemanal;
    }
    public double ganhos(){
        this.salarioSemanal=salarioSemanal*7;
        return salarioSemanal;
    }
    
    public String toString(){
        String Funcionario_Assalariado="Nome: "+getNome()+ " salario semanal R$: " +this.salarioSemanal;
        return Funcionario_Assalariado; 
    }
    
}
