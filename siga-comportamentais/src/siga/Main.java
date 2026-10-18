package siga;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  SIGA — DEMONSTRAÇÃO STRATEGY E OBSERVER");
        System.out.println("==================================================");

        // 1. Configuração do Publicador (Observer)
        PublicadorMatricula publicador = new PublicadorMatricula();

        // Registro das reações originais
        publicador.registrar(new NotificadorEmail());
        publicador.registrar(new PainelVagas());
        publicador.registrar(new AvisoCoordenacao()); // Esta reação lança exceção propositalmente
        publicador.registrar(new RegistroAuditoria()); // Deve rodar mesmo com a falha acima

        // Etapa 5: Adicionando a 5ª reação SEM alterar a FachadaMatricula
        publicador.registrar(new EstatisticaOcupacao());

        // 2. Instanciação da Fachada
        FachadaMatricula fachada = new FachadaMatricula(publicador);

        // 3. Casos de Teste com Strategy (Descontos)
        double valorPadrao = 800.00;

        Aluno alunoNormal = new Aluno("João Silva", "joao@fatec.sp.gov.br");
        Matricula m1 = new Matricula(alunoNormal, valorPadrao, new SemDesconto());

        Aluno alunoBolsista = new Aluno("Maria Santos", "maria@fatec.sp.gov.br");
        Matricula m2 = new Matricula(alunoBolsista, valorPadrao, new DescontoBolsista());

        Aluno alunoServidor = new Aluno("Pedro Oliveira", "pedro@fatec.sp.gov.br");
        Matricula m3 = new Matricula(alunoServidor, valorPadrao, new DescontoServidor());

        // Caso crítico: Ana Pereira (Egressa) - Deve ser R$ 720,00 tanto na matrícula quanto no boleto
        Aluno alunaEgressa = new Aluno("Ana Pereira", "ana@fatec.sp.gov.br");
        Matricula m4 = new Matricula(alunaEgressa, valorPadrao, new DescontoEgresso());

        // Execução das matrículas através da fachada
        fachada.matricular(m1);
        fachada.matricular(m2);
        fachada.matricular(m3);
        fachada.matricular(m4);
    }
}