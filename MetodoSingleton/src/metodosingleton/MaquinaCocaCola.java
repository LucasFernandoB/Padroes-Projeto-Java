package metodosingleton;


import metodosingleton.Suco;


public class MaquinaCocaCola implements MaquinaBebida{

    private MaquinaCocaCola() {
        
    }
    private static MaquinaCocaCola _INSTANCIA = new MaquinaCocaCola();
    public static MaquinaCocaCola getInstancia() {
     return _INSTANCIA;
}

    
    
    public Refrigerante entregaRefrigerente(){
        return new CocaCola();
        
    }
    public Suco entregaSuco (){
        return new DelVale();
        
    }
    
}
