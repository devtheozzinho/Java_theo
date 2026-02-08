package funcionarios;

public class Trabalhadores {

    public String nome;
    public double salario_bruto;
    public double taxa;

    public double aumentarSalario() {
        return this.salario_bruto + taxaAplicada();
    }

    public void aplicarNovaTaxa(double novaTaxa) {
        this.taxa = novaTaxa;
        this.salario_bruto = this.salario_bruto + (this.salario_bruto * novaTaxa / 100);
    }

    public double taxaAplicada() {
        return this.salario_bruto * (this.taxa / 100);
    }

    public String novoSalario() {
        return nome
                + " $ "
                + salario_bruto;
    }

}


