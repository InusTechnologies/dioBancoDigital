package Desenvolvendo;

public class ContaCorrenteDesenvolvendo extends Conta {

   public void imprimirExtrato(){
       System.out.println("***O extrato Conta Corrente*** ");

       System.out.println(String.format("Agencia: %d ", super.agencia));
       System.out.println(String.format("Número: %d ", super.agencia));
       System.out.println(String.format("Saldo: %2.f ", super.agencia));
   }
}

