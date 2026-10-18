package siga;

public package siga;

public class DescontoBolsista implements PoliticaDesconto {
    @Override
    public double aplicar(double valorBase) {
        return valorBase * 0.50; // 50% de desconto
    }

    @Override
    public String getDescricao() {
        return "Desconto Bolsista (50%)";
    }
} {
    
}
