package edu.uacm;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import edu.uacm.domain.Aeropuerto;
import edu.uacm.domain.AeropuertoRepository;
import edu.uacm.domain.Avion;
import edu.uacm.domain.AvionRepository;
import edu.uacm.domain.Pasajero;
import edu.uacm.domain.PasajeroRepository;
import edu.uacm.domain.Vuelo;
import edu.uacm.domain.VueloRepository;


@SpringBootApplication
public class Application implements CommandLineRunner {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AeropuertoRepository AR;
    @Autowired
    private AvionRepository AV;
    @Autowired
    private VueloRepository V;
    @Autowired
    private PasajeroRepository pg;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... strings) throws Exception {      
    	log.debug("Entrando a Aeropuerto Insertar");
    	Aeropuerto ae=new Aeropuerto();
    	ae.setIdaeropuerto(1l);
    	ae.setNombreaeropuerto("AeroMexico");
		ae.setCiudad("Ciudad de Mexico");
		ae.setPais("Mexico");
		AR.save(ae);
		//otro aeropuerto
    	Aeropuerto ae4=new Aeropuerto();
    	ae4.setIdaeropuerto(4l);
    	ae4.setNombreaeropuerto("AeroMadrid");
		ae4.setCiudad("Madrid");
		ae4.setPais("España");
		AR.save(ae4);
		log.debug("Entrando a Aviones Insertar");
		Avion av=new Avion();
		av.setIdavion(1l);
		av.setModeloavion("x87");
		av.setCapacidad(40);
		av.setLineaaerea("LineaExpress");
		AV.save(av);
		log.debug("Entrando a Vuelos Insertar");
		
		Vuelo v=new Vuelo();
		v.setIdvuelo(100L);
		SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yy HH:mm");
		Date date = parseador.parse("31/03/2016 17:23");
		Date date2 = parseador.parse("1/04/2016 02:23");
		
		v.setHorallegada(date);
		v.setHorasalida(date2);
		v.setAeropuerto_idaeropuerto(1L);
		v.setAeropuerto_idaeropuerto2(4L);
		v.setAvion_idavion(1L);
		V.save(v);
		Pasajero p=new Pasajero();
		p.setIdpasajero(1L);
		p.setNombre("Gerardo");
		p.setApellidopaterno("Leyva");
		p.setApellidomaterno("Teutli");
		p.setFechanacimiento("23/01/1992");
		p.setNacionalidad("Mexicana");
		p.setVuelo_idvuelo(100L);
		pg.save(p);
    }
}
