
package metodostate;
public class EstadoVermelho extends Estado{
   
    
    @Override
    public void efetuarSaque(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        System.out.println("Nao e possivel efetuar o saque");
    }
    @Override
    public void efetuarDeposito(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        conta.setSaldo(saldoAtual+quantia);
        
        
        if(conta.getSaldo()>1000){
            conta.setEstado(new EstadoOuro());
        }
        else
          conta.setEstado(new EstadoPrata());  
    }  
}