/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.Gosc;
import model.ListGosc;

/**
 *
 * @author HP
 */
public class GoscDodaj extends FramePensjonat{


    

    public static void dodajGoscia(
            int nowyGoscID,
            String nowyGoscImie,
            String nowyGoscNazwisko,
            String nowyGoscPesel,
            String nowyGoscNrTelefonu,
            String nowyGoscEmail) {

        try {

            List<Gosc> listaGosciKod = new ArrayList<>();

            listaGosciKod.add(new Gosc(
                    nowyGoscID,
                    nowyGoscImie,
                    nowyGoscNazwisko,
                    nowyGoscPesel,
                    nowyGoscNrTelefonu,
                    nowyGoscEmail)
            );

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
