public abstract class Funcionario{ //ok
    private String nome;
    private String matricula;
    
    Funcionario(){
    }
    Funcionario(String nome, String matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    
    public abstract String toString();

    public abstract double ganhos();
}