
public class MaquinaCocaCola implements MaquinaBebida{
    
    
    public Refrigerante entregaRefrigerente(){
        return new CocaCola();
        
    }
    public Suco entregaSuco (){
        return new DelVale();
        
    }
    
}
