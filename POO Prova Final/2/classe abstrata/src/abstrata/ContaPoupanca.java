public class ContaPoupanca extends Conta {

    @Override
    public void imprimeExtrato() {
        System.out.println("-- Extrato da conta --");

        System.out.println("Saldo: " + this.getSaldo());

    }
    
}
