package Polimorfismo;

public class ContaCorrentePolimorfismo extends Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public ContaCorrentePolimorfismo() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
}

