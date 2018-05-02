/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author HP
 */
@XmlRootElement (name = "ListaGosci")
public class ListGosc {
    
     protected List<Gosc> listaGosci = new ArrayList<Gosc>();
     
     public List<Gosc> getListaGosci(){
         return  listaGosci;
     }
     
     
     
     
     
     
     @XmlElement(name = "gosc")
     public void setListaGosci(List<Gosc> listaGosci){
         this.listaGosci = listaGosci;
     }
    
}
