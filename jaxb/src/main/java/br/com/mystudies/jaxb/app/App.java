package br.com.mystudies.jaxb.app;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import br.com.mystudies.jaxb.ObjectFactory;
import br.com.mystudies.jaxb.TConsNFeDest;

public class App {

	public static void main(String[] args) throws Exception {

		TConsNFeDest tConsNFeDest = new TConsNFeDest();
		tConsNFeDest.setXServ("CONSULTAR NFE DEST");
		tConsNFeDest.setTpAmb("2");
		tConsNFeDest.setCNPJ("24456548000109");
		tConsNFeDest.setIndNFe("0");
		tConsNFeDest.setIndEmi("0");
		tConsNFeDest.setUltNSU("0");
		tConsNFeDest.setVersao("1.01");


			JAXBContext jaxbContext = JAXBContext.newInstance(TConsNFeDest.class);

	        Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	        ObjectFactory objectFactory = new ObjectFactory();
	        JAXBElement<TConsNFeDest> jaxbElement = objectFactory.createConsNFeDest(tConsNFeDest);

	        marshaller.marshal(jaxbElement, System.out);


	}
}
