
public class ClientQuiosque {
    public MaquinaBebida tipo;
    
    
    public String pegarRefri(){
      
        return tipo.entregaRefrigerente().pegar();
        
    }
    public  String pegarSuco(){
        return tipo.entregaSuco().pegar();
    }
}
