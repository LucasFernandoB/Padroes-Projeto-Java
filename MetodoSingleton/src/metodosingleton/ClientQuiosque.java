/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosingleton;

/**
 *
 * @author lucas
 */
public class ClientQuiosque {
    public MaquinaBebida tipo;
    
    
    public String pegarRefri(){
      
        return tipo.entregaRefrigerente().pegar();
        
    }
    public  String pegarSuco(){
        return tipo.entregaSuco().pegar();
    }
}

