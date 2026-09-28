package ex2_p2.Banco;

public class Conta {
    private String numero, titular;
    private double saldo;

    public Conta (String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("Número: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
    public void mostrarDados(double projMensal) {
        double percentual = projMensal / 100.0;
        double saldoProjetado = getSaldo() * (1 + percentual);

        System.out.println("Número: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo projetado após 1 mês (" + projMensal + "%): " + saldoProjetado);
    }

    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
