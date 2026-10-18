package siga;

public class FachadaMatricula {

    private final PublicadorMatricula publicador;

    public FachadaMatricula(PublicadorMatricula publicador) {
        this.publicador = publicador;
    }

    public void matricular(Matricula matricula) {
        System.out.printf("%n=== Processando Matrícula: %s ===%n", matricula.getAluno().getNome());
        
        // Emissão do boleto com valor unificado
        GeradorBoleto.emitir(matricula);

        // Notificação de todos os ouvintes registrados
        publicador.publicar(matricula);
    }
}