package siga;

public class AvisoCoordenacao implements OuvinteMatricula {
    @Override
    public void aoMatricular(Matricula matricula) {
        System.out.println("[COORDENAÇÃO] Tentando sincronizar com sistema legado da coordenação...");
        throw new RuntimeException("Serviço legado da coordenação fora do ar!");
    }
}