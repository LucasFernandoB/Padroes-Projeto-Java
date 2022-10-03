
package padraoobservador;
public class TelaPrevisao implements TelaObservar{

    private EstacaoSujeito dadostempo;

    public TelaPrevisao(EstacaoSujeito dadostempo) {
        this.dadostempo = dadostempo;
    }
    
    @Override
    public void atualizarTempo(float temperatura, float umidade) {
        double minima = temperatura - (umidade*0.1);
        double maxima = temperatura + (umidade*0.1);
        
        System.out.println("\n====TELA CONDICOES ATUAIS ");
        System.out.println("Condicoes atuais: "+ temperatura+" ºC e "+umidade+" % de umidade");


    }
    
}
