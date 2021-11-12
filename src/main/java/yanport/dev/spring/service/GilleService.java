package yanport.dev.spring.service;

import org.springframework.stereotype.Service;

import yanport.dev.spring.entity.Grille;

@Service
public class GilleService implements IGrilleService {

	@Override
	public Grille Init_grille(Grille grille) {
		if (grille.getAxe_x() != grille.getAxe_y()) {
			System.out.print("Les deux axes doivent etre egaux! ");
			return null;
		} else {
			return grille;
		}
	}

}
