package br.com.mystudies.domain;

import static java.util.Arrays.asList;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Header {

	@XmlAttribute
	private Header header = new Header();

	@XmlAttribute
	private List<Line> lines = asList(new Line(), new Line());

}
