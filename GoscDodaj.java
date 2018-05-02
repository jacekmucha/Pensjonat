/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



/**
 *
 * @author HP
 */
public class GoscDodaj {
    
       public static void dodajGoscia(){
        
       try {
        
        List<Gosc> listaGosciKod = new ArrayList<>();
        
        listaGosciKod.add(new Gosc(1, "Andrzej", "Kowalski", "111111", "500 400 100", "kowalski@domena.com"));
      
        
        ListGosc lg = new ListGosc();
        lg.setListaGosci(listaGosciKod);
        
        File goscieXmlBaza = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Pensjonat\\src\\database\\bazaXMLgoscie.xml");
        
        JAXBContext context = JAXBContext.newInstance(ListGosc.class);
        
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        marshaller.marshal(lg, goscieXmlBaza);
        
        
        
    } catch (JAXBException exception) {
           System.out.println("Problem z załadowaniem danych");
           exception.printStackTrace();
    }
    
}
       
}
