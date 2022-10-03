
package metodostate;
public class EstadoOuro extends Estado{
    private double rendimentoDeposito= 0.001;
    @Override
    public void efetuarSaque(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual-quantia);
        
        if(conta.getSaldo()<0){
            conta.setEstado(new EstadoVermelho());
        }
        else if(conta.getSaldo()<=1000)
            conta.setEstado(new EstadoPrata());
    }
    
    @Override
    public void efetuarDeposito(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual+quantia+(quantia*rendimentoDeposito));
        System.out.println("Rendimento Creditado!");
    } 
}
