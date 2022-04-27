import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      FuncionarioComissionado f1 = new FuncionarioComissionado();
      FuncionarioAssalariado f2 = new FuncionarioAssalariado();
      FuncionarioHora f3 = new FuncionarioHora();
      
      int op;
      System.out.println("Entre com um tipo de Funcionario:");
      System.out.println("1-Funcionario Comissionado");
      System.out.println("2-Funcionario Assalariado");
      System.out.println("3-Funcionario Hora");
      op = in.nextInt();

        if(op==1){//Funcionario comissionado
            in.nextLine();
            System.out.println("Informe o nome do funcionario:");
            f1.setNome(in.nextLine());
            System.out.println("Informe a matricula: ");
            f1.setMatricula(in.nextLine());
            System.out.println("Quantidade de vendas: ");
            f1.setQuantidadeVendas(in.nextInt());
            System.out.println("Valor da venda em R$:");
            f1.setValorPorVenda(in.nextDouble());
            System.out.println("Dados: "+ f1.toString());
            System.out.println("Rendimentos em R$: "+ f1.ganhos());
        }
        else if(op==2){//Funcionario Assalariado
            in.nextLine();
            System.out.println("Informe o nome do funcionario:");
            f2.setNome(in.nextLine());
            System.out.println("Informe a matricula do funcionario: ");
            f2.setMatricula(in.nextLine());
            System.out.println("Informe o valor da diaria do mesmo em R$:");
            f2.setSalarioSemanal(in.nextDouble());
            System.out.println("Dados: "+ f2.toString());
            System.out.println("rendimentos considerando uma semana de 6 dias de trabalho  R$: "+ f2.ganhos());
        }
        else if(op==3){//Funcionario Hora
            in.nextLine();
            System.out.println("Informe o nome do funcionario: ");
            f3.setNome(in.nextLine());
            System.out.println("Informe a matricula do funcionario:");
            f3.setMatricula(in.nextLine());
            System.out.println("Informe a quantidade de horas trabalhadas:");
            f3.setHoras(in.nextInt());
            System.out.println("Informe o valor pago por hora em R$:");
            f3.setValorDaHora(in.nextDouble());
            System.out.println("Dados: "+f3.toString());
            System.out.println("Rendimentos Hora x Valor da hora em R$: "+f3.ganhos());
        }
        else{
            System.out.println("Opcao de entrada invalida");
        }
    }
}
