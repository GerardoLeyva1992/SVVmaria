package edu.uacm.test.domain;

import org.junit.Test;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import edu.uacm.Application;
import edu.uacm.domain.Avion;
import edu.uacm.domain.AvionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class AvionTest {
	//private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	AvionRepository ar;
	

	@Autowired
	DataSource ds;
	@Test
	public void insertarAvion(){
		Avion a=new Avion();
		//a.setIdavion(1L);
		a.setModeloavion("x86");
		a.setCapacidad(50);
		a.setLineaaerea("Mexicana");
		ar.save(a);
		Assert.assertNotNull(a);	
	}	

	
}