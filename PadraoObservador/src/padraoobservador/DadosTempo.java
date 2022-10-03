
package padraoobservador;

import java.util.ArrayList;

public class DadosTempo implements EstacaoSujeito{
    private float temperatura;
    private float umidade;
    
    private ArrayList<TelaObservar> observadores;

    public  DadosTempo(){
        observadores = new ArrayList<TelaObservar>();
        
    }
    
    @Override
    public void registrarObservador(TelaObservar observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(TelaObservar observador) {
        int i = observadores.indexOf(observador);
        if (i>=0){
            observadores.remove(i);
        }
        
    }
    
    @Override
    public void notificarObservador() {
        for(TelaObservar obs: observadores){
            obs.atualizarTempo(temperatura, umidade);
        }
        
    }
    public void atualizarMedicoes(float temp, float umid){
        this.temperatura= temp;
        this.umidade= umid;
        notificarObservador();
    }
    
}
