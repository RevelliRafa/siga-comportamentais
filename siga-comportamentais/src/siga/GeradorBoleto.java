package siga;

public class GeradorBoleto {

    public static void emitir(Matricula matricula) {
        // Usa a mesma regra e política da matrícula, sem duplicar condicionais
        double valorBoleto = matricula.calcularValor();

        System.out.printf("[BOLETO] Sacado: %s | Valor: R$ %.2f (%s)%n",
                matricula.getAluno().getNome(),
                valorBoleto,
                matricula.getPoliticaDesconto().getDescricao());
    }
}