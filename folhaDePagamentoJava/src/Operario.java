public class Operario extends Remuneracao {
    public Operario (String nome, String RA, double salario , double horaExtra, double valeRefeicao) {
        super(nome, RA, salario, horaExtra, valeRefeicao);
}

@Override
public double calcularSalarioLiquido(){ // SOBRESCREVE O TO STRING COM AS INFORMAÇÕES DO GERENTE
        
    double salarioBruto = getSalario() + getHoraExtra();
    double inss = calcularINSS(salarioBruto);
    double irrf = calcularIRRF(salarioBruto, inss);
    
    return salarioBruto - (inss + irrf);
    }

public String getFuncao(){ // INFORMA PARA A CLASSE REMUNERAÇÃO A FUNÇÃO DO FUNCIONAARIO
    return "OPERARIO"; 
    }

}