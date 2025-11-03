public class Funcionario extends Object { //SUPER CLASS

    //Atributos privados    
    private String nome;
    private String RA;
    private double salario;
    private double horaExtra;
    private double valeRefeicao;


    
    public Funcionario(String nome, String RA, double salario, double horaExtra, double valeRefeicao) { // CONSTRUTOR 
        this.nome = nome;
        this.RA = RA;
        this.salario = salario;
        this.horaExtra = horaExtra;
        this.valeRefeicao = valeRefeicao;
    }

    // Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

     public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getValeRefeicao(){
        return valeRefeicao;
    }

    public void setValeRefeicao (double valeRefeicao){
        this.valeRefeicao = valeRefeicao;
    }

    @Override  // RELATÓRIO COM AS INFORMAÇÕES BÁSICAS DOS FUNCIONÁRIOS. 
    public String toString() {
        double salarioBruto = getSalario() + getHoraExtra();
        return 
            "--- INFORMAÇÕES DO FUNCIONARIO ---" + 
            "\nNome do Funcionário: " + getNome() +
            "\nCadastro RA: " + getRA() +
            "\nSalario Fixo: R$: " + getSalario() + 
            "\nValor Hora Extra: R$ " + getHoraExtra() +
            "\nVale Refeição: R$ " + getValeRefeicao() +  
            "\n\nSALARIO BRUTO: R$" + salarioBruto +
            "\n\n";
    }
}
