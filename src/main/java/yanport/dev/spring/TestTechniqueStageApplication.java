package yanport.dev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import yanport.dev.spring.entity.Aspirateur;
import yanport.dev.spring.entity.Grille;
import yanport.dev.spring.service.AspirateurService;
import yanport.dev.spring.service.GilleService;

@SpringBootApplication
public class TestTechniqueStageApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TestTechniqueStageApplication.class, args);
		AspirateurService servicea = applicationContext.getBean(AspirateurService.class);
		GilleService serviceg = applicationContext.getBean(GilleService.class);
		Grille g = new Grille();
		g.setAxe_x(10);
		g.setAxe_y(10);
		g = serviceg.Init_grille(g);
		Aspirateur a = new Aspirateur();
		a.setPosx(5);
		a.setPosy(5);
		a.setorientaion("N");
		a = servicea.Init(a, g);
		servicea.Avance("DADADADAA", a, g);
	}

}
