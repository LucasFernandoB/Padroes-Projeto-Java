
package padraoobservador;
public interface EstacaoSujeito {
    
    public void registrarObservador(TelaObservar observador);
    public void removerObservador(TelaObservar observador);
    public void notificarObservador();
    
}
