public class FuncionarioHora extends Funcionario{
    private int horas;
    private double valorDaHora;

    FuncionarioHora(String nome, String matricula, int horas, double valorDaHora){//a definir construtor
        super(nome, matricula);
        this.horas=horas;
        this.valorDaHora=valorDaHora;
    }
    FuncionarioHora(){

    }

    public void setHoras(int horas){
        this.horas=horas;
    }
    public int getHoras(){
        return this.horas;
    }
    public void setValorDaHora(double valorDaHora){
        this.valorDaHora=valorDaHora;
    }
    public double getValorDaHora(){
        return this.valorDaHora;
    }
    public double ganhos(){
        double ganhoTotal=getHoras()*getValorDaHora();
        return ganhoTotal;
    }
    
    public String toString(){
        String Funcionario_Hora="Nome: "+getNome()+" matricula: "+getMatricula()+"Quantidade de horas:  " +this.horas+ " valor da hora R$: "+this.valorDaHora;
        return Funcionario_Hora; 
    }

}
