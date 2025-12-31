package ex2_p2.Banco;

public class ContaCorrente extends Conta{
    private double limCheque;

    public ContaCorrente (String numero, String titular, double saldo, double limCheque){
        super(numero, titular, saldo);
        this.limCheque = limCheque;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Limite do cheque especial: " + getLimCheque());
    }
    public void mostrarDados(boolean mostrarLimite){
        super.mostrarDados();
        if (mostrarLimite){
            double saldoDisponivel = getSaldo() + getLimCheque();
            System.out.println("Limite do cheque especial: " + getLimCheque());
            System.out.println("Saldo total disponível (Saldo + Limite): " + saldoDisponivel);
        }
    }

    public double getLimCheque(){
        return limCheque;
    }
}
