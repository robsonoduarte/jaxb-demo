package br.com.mystudies.jaxb.app;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import br.com.mystudies.jaxb.ObjectFactory;
import br.com.mystudies.jaxb.TConsNFeDest;

public class App {

	public static void main(String[] args) throws Exception {

		TConsNFeDest tConsNFeDest = new TConsNFeDest();
		tConsNFeDest.setCNPJ("000");
		tConsNFeDest.setIndEmi("temp");
		tConsNFeDest.setIndNFe("temp");
		tConsNFeDest.setTpAmb("temp");
		tConsNFeDest.setVersao("1.0.1");


/*		JAXBContext jaxbContext = JAXBContext.newInstance(TConsNFeDest.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(jaxbContext, System.out);*/






			JAXBContext jaxbContext = JAXBContext.newInstance(TConsNFeDest.class);

	        Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	        ObjectFactory objectFactory = new ObjectFactory();
	        JAXBElement<TConsNFeDest> jaxbElement = objectFactory.createConsNFeDest(tConsNFeDest);

	        marshaller.marshal(jaxbElement, System.out);


	}
}
