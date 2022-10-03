
package metodostate;
public class EstadoPrata extends Estado{
    private double taxaSaque=1.00;
    
    @Override
    public void efetuarSaque(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual-quantia-taxaSaque);
        System.out.println("Taxa de saque cobrada vacilao!");
        if(conta.getSaldo()<0){
            conta.setEstado(new EstadoVermelho());
        }
    }
    @Override
    public void efetuarDeposito(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual+quantia);
        System.out.println("Taxa de saque cobrada vacilao!");
        if(conta.getSaldo()>1000){
            conta.setEstado(new EstadoOuro());
        }
    } 
}
