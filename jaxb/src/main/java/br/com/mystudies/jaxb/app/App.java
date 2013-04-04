package br.com.mystudies.jaxb.app;

import javax.xml.bind.JAXBElement;

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
		
		
		ObjectFactory objectFactory = new ObjectFactory();
		JAXBElement<TConsNFeDest> jaxbElement = objectFactory.createConsNFeDest(tConsNFeDest);
		
		
		System.out.println(jaxbElement);
		
	
	}
}
