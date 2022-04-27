
public class FuncionarioComissionado extends Funcionario{//ok
    private int quantidadeVendas;
    private double valorPorVenda;

    FuncionarioComissionado(String nome, String matricula, int quantidadeVendas, double valorPorVenda){//falta definir construtor
        super(nome, matricula);
        this.quantidadeVendas=quantidadeVendas;
        this.valorPorVenda=valorPorVenda;
    }
    FuncionarioComissionado(){

    }
    public int getQuantidadeVendas(){
        return this.quantidadeVendas;
    }
    public double getValorPorVenda(){
        return this.valorPorVenda;
    }
    public void setQuantidadeVendas(int quantidadeVendas){
        this.quantidadeVendas=quantidadeVendas;
    }
    public void setValorPorVenda(double valorPorVenda){
        this.valorPorVenda=valorPorVenda;
    }
    
    public String toString(){
        String Funcionario_Comissionado="Nome: "+this.getNome() +" Qtd de vendas: " +this.quantidadeVendas + " Valor por venda R$: "+ this.valorPorVenda;
        return Funcionario_Comissionado; 
    }
    public double ganhos() {
        double total = getQuantidadeVendas()*getValorPorVenda();
        return total;       
    }
}
