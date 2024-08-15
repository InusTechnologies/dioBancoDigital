package Desenvolvendo;

public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO1 = 1;
    private static int SEQUENCIAL1 = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = AGENCIA_PADRAO1;
        this.numero = SEQUENCIAL1++;
    }

    public void sacar() {


    }


    public void depositar(double valor, Conta contaDestino) {


    }

    public void transferir(double valor) {


    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}

