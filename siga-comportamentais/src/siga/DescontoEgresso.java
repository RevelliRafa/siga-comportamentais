package siga;

public package siga;

public class DescontoEgresso implements PoliticaDesconto {
    @Override
    public double aplicar(double valorBase) {
        return valorBase * 0.90; // 10% de desconto
    }

    @Override
    public String getDescricao() {
        return "Desconto Egresso (10%)";
    }
} {
    
}
