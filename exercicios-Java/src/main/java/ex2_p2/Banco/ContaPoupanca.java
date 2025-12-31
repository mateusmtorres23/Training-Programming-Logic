package ex2_p2.Banco;

public class ContaPoupanca extends Conta{
    private double taxaRendimentoMensal;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal){
        super(numero, titular, saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de rendimento mensal: " + getTaxaRendimentoMensal() + "%");
    }
    public void mostrarDados(boolean taxaAnual){
        super.mostrarDados();
        if(taxaAnual){
            double taxa = getTaxaRendimentoMensal() * 12;
            System.out.println("Taxa de rendimento anual: " + taxa + "%");
        }
    }

    public double getTaxaRendimentoMensal() {
        return  taxaRendimentoMensal;
    }

    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

}
