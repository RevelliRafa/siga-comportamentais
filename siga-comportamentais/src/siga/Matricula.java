package siga;

public class Matricula {

    private final Aluno aluno;
    private final double valorBase;
    private final PoliticaDesconto politicaDesconto;

    // Recebe a política por injeção de dependência no construtor
    public Matricula(Aluno aluno, double valorBase, PoliticaDesconto politicaDesconto) {
        this.aluno = aluno;
        this.valorBase = valorBase;
        this.politicaDesconto = politicaDesconto;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double getValorBase() {
        return valorBase;
    }

    public PoliticaDesconto getPoliticaDesconto() {
        return politicaDesconto;
    }

    // Delega integralmente o cálculo à estratégia escolhida
    public double calcularValor() {
        return politicaDesconto.aplicar(valorBase);
    }

    @Override
    public String toString() {
        return String.format("%s — Base: R$ %.2f | %s | Final: R$ %.2f",
                aluno.getNome(), valorBase, politicaDesconto.getDescricao(), calcularValor());
    }
}