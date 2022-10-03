
package padraoobservador;
public class PadraoObservador {
    public static void main(String[] args) {
        
       DadosTempo dados = new DadosTempo();
       TelaTempoAgora telaAgora= new TelaTempoAgora(dados);
       TelaPrevisao telaPrevisao = new TelaPrevisao(dados);
        
       dados.atualizarMedicoes(15, 80);
       dados.atualizarMedicoes(25, 60);
       dados.atualizarMedicoes(30, 50);
       dados.atualizarMedicoes(35, 40);
       
       
       
       
        
    }
    
}
