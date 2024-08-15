package Desenvolvendo;

public class ContaPoupancaDesenvolvendo extends Conta {
    public void imprimirExtrato(){
        System.out.println("***O extrato Conta Poupança*** ");
        System.out.println(String.format("Agencia: %d ", super.agencia));
        System.out.println(String.format("Número: %d ", super.agencia));
        System.out.println(String.format("Saldo: %.2f ", super.agencia));
}
}
