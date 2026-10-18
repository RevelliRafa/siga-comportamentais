package siga;

public package siga;

import java.util.ArrayList;
import java.util.List;

public class PublicadorMatricula {

    private final List<OuvinteMatricula> ouvintes = new ArrayList<>();

    public void registrar(OuvinteMatricula ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void remover(OuvinteMatricula ouvinte) {
        ouvintes.remove(ouvinte);
    }

    public void publicar(Matricula matricula) {
        // Percorre uma cópia defensiva da lista de ouvintes
        List<OuvinteMatricula> copiaOuvintes = new ArrayList<>(ouvintes);

        for (OuvinteMatricula ouvinte : copiaOuvintes) {
            try {
                ouvinte.aoMatricular(matricula);
            } catch (Exception e) {
                // Falha de um ouvinte não pode interromper os demais ouvintes
                System.err.printf("[FALHA NO OUVINTE %s]: %s%n",
                        ouvinte.getClass().getSimpleName(), e.getMessage());
            }
        }
    }
} {
    
}
