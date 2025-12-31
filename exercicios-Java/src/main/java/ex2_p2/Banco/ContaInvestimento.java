package ex2_p2.Banco;

public class ContaInvestimento extends Conta{
    private double taxaDeAdministracao;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaDeAdministracao){
        super(numero, titular, saldo);
        this.taxaDeAdministracao = taxaDeAdministracao;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de administração: " + getTaxaDeAdministracao() + "%");
    }
    public void mostrarDados(boolean considerarTaxa){
        super.mostrarDados();

        if(considerarTaxa){
            double projecaoPadrao = 10.0;
            double saldoAposProjecao = getSaldo() * (1 + (projecaoPadrao / 100.0));
            double taxaDecimal = getTaxaDeAdministracao() / 100.0;
            double saldoLiquido = saldoAposProjecao - (saldoAposProjecao * taxaDecimal);
            System.out.println("Saldo Líquido Projetado (10% de projeção menos taxa de adm.): " + saldoLiquido);
        }
    }

    public double getTaxaDeAdministracao(){
        return taxaDeAdministracao;
    }

    public void setTaxaDeAdministracao(double taxaDeAdministracao) {
        this.taxaDeAdministracao = taxaDeAdministracao;
    }
}
