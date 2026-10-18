package siga;

public package siga;

public class EstatisticaOcupacao implements OuvinteMatricula {

    private int totalMatriculas = 0;

    @Override
    public void aoMatricular(Matricula matricula) {
        totalMatriculas++;
        System.out.printf("[ESTATÍSTICA] Total de matrículas confirmadas no curso: %d%n", totalMatriculas);
    }
} {
    
}
