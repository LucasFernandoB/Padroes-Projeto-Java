
package padraoobservador;
public class TelaTempoAgora implements TelaObservar{

    private EstacaoSujeito dadosTempo;
    
    public TelaTempoAgora(EstacaoSujeito estacao ) {
        this.dadosTempo=estacao;
        this.dadosTempo.registrarObservador(this);
         this.dadosTempo.registrarObservador(this);
    }

    
    public void atualizarTempo(float temperatura, float umidade) {
        System.out.println("\n====TELA CONDICOES ATUAIS===== ");
        System.out.println("Condicoes atuais: "+ temperatura+" ºC e "+umidade+"% de umidade");
        
    }
    
}
