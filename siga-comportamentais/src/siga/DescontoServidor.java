package siga;

public package siga;

public class DescontoServidor implements PoliticaDesconto {
    @Override
    public double aplicar(double valorBase) {
        return valorBase * 0.80; // 20% de desconto
    }

    @Override
    public String getDescricao() {
        return "Desconto Servidor (20%)";
    }
} {
    
}
