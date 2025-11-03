public class Remuneracao extends Funcionario {

    public Remuneracao(String nome, String RA, double salario, double horaExtra, double valeRefeicao) {
        super(nome, RA, salario, horaExtra, valeRefeicao); // CONSTRUTOR
    }

    public double calcularINSS(double salarioBruto) { // MÉTODO QUE CALCULA E RETORNA O VALOR REFERENTE AO IMPOSTO DO INSS POR FAIXA DE CONTRIBUIÇÃO.
        double inss = 0;
    if (salarioBruto <= 1412.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2666.68) {
            inss = (1412.00 * 0.075) + ((salarioBruto - 1412.00) * 0.09);
        } else if (salarioBruto <= 4000.03) {
            inss = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09)
                 + ((salarioBruto - 2666.68) * 0.12);
        } else if (salarioBruto <= 7786.02) {
            inss = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09)
                 + ((4000.03 - 2666.68) * 0.12)
                 + ((salarioBruto - 4000.03) * 0.14);
        } else {
            inss = 908.85; // teto máximo
        }
        return inss;
    }

    public double calcularIRRF(double salarioBruto, double inss) { // MÉTODO PARA CALCULO E RETORNA O VALOR REFERENTE AO IMPOSTO DE RENDA.
        double baseCalculoIR = salarioBruto - inss;
        double irrf;

        if (baseCalculoIR <= 2259.20) {
            irrf = 0.0;
        } else if (baseCalculoIR <= 2826.65) {
            irrf = (baseCalculoIR * 0.075) - 169.44;
        } else if (baseCalculoIR <= 3751.05) {
            irrf = (baseCalculoIR * 0.15) - 381.44;
        } else if (baseCalculoIR <= 4664.68) {
            irrf = (baseCalculoIR * 0.225) - 662.77;
        } else {
            irrf = (baseCalculoIR * 0.275) - 896.00;
        }

        return irrf;
    }

    public double calcularSalarioLiquido() { // MÉTODO PARA CALCULO DO SALÁRIO LÍQUIDO DO FUNCIONÁRIO. 
        double salarioBruto = getSalario() + getHoraExtra();
        double inss = calcularINSS(salarioBruto);
        double irrf = calcularIRRF(salarioBruto, inss);
        return (salarioBruto - inss - irrf) + getValeRefeicao();
    }

    public String getFuncao(){ // MÉTODO PARA IMPRIMIR A FUNÇÃO DO FUNCIONÁRIO QUE É INFORMADA PELA SUBCLASSE 
        return "Função do Funcionário";
    }

    @Override
    public String toString() { // SUBRESCREVE O TO STRING PARA INFORMAR OS CALCULOS FINANCEIROS.
        double salarioBruto = getSalario() + getHoraExtra();
        double inss = calcularINSS(salarioBruto);
        double irrf = calcularIRRF(salarioBruto, inss);
        double liquido = calcularSalarioLiquido();
        double deducao = inss + irrf;

        return super.toString() + // RELATÓRIO
            "\n--- CALCULO ---" + 
            "\nFunção: " + getFuncao() +
            "\nINSS: R$ " + String.format("%.2f", inss) +
            "\nIRRF: R$ " + String.format("%.2f", irrf) +
            "\nDedução do salario R$ " + String.format("%.2f", deducao) + 
            "\nSalário Líquido: R$ " + String.format("%.2f", liquido);
    }
}
