package Pagamento;

public class Salario {
    private double salario;
    private double horasTrabalhadas;
    private double diasTrabalhados;

    public Salario(double salario, double horasTrabalhadas, double diasTrabalhados) {
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getSalario() {
        return salario;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getDiasTrabalhados() {
        return diasTrabalhados;
    }
}
