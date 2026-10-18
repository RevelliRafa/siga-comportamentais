package siga;

public class RegistroAuditoria implements OuvinteMatricula {
    @Override
    public void aoMatricular(Matricula matricula) {
        System.out.printf("[AUDITORIA] Matrícula registrada com sucesso: %s | Valor final: R$ %.2f%n",
                matricula.getAluno().getNome(), matricula.calcularValor());
    }
}