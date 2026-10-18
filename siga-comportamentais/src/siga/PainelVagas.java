package siga;

public class PainelVagas implements OuvinteMatricula {
    @Override
    public void aoMatricular(Matricula matricula) {
        System.out.println("[PAINEL] Vaga ocupada no sistema acadêmico.");
    }
}