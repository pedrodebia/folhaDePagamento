public class Gerente extends Remuneracao { 
    public Gerente (String nome, String RA, double salario , double horaExtra, double valeRefeicao) { // CONSTRUTOR
        super(nome, RA, salario, horaExtra, valeRefeicao);
}

@Override
public String toString() { // SOBRESCREVE O TO STRING COM AS INFORMAÇÕES DO GERENTE
    double bonusGerente = 1500;
    double liquido = calcularSalarioLiquido();
    double salarioGerente = liquido + bonusGerente;

    return super.toString() + // RELATÓRIO
    "\nBônus Gerente: R$ " + String.format("%.2f", bonusGerente) + 
    "\nSalario Final Gerente: R$ " + String.format("%.2f",salarioGerente);
    }

public String getFuncao(){ // INFORMA PARA A CLASSE REMUNERAÇÃO A FUNÇÃO DO FUNCIONAARIO 
    return "GERENTE";
}

}