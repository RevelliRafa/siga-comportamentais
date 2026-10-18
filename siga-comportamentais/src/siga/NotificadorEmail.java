package siga;

public class NotificadorEmail implements OuvinteMatricula {
    @Override
    public void aoMatricular(Matricula matricula) {
        System.out.printf("[EMAIL] Confirmação enviada para %s (%s)%n",
                matricula.getAluno().getNome(), matricula.getAluno().getEmail());
    }
}