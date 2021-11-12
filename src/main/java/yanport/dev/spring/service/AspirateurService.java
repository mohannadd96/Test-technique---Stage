package yanport.dev.spring.service;

import org.springframework.stereotype.Service;

import yanport.dev.spring.entity.Aspirateur;
import yanport.dev.spring.entity.Grille;

@Service
public class AspirateurService implements IAspirateurService {

	@Override
	public Aspirateur Init(Aspirateur asp, Grille grille) {
		if (grille.getAxe_x() < asp.getPosx()) {
			System.out.print("L'axe x est inferieur a la pos x");
			return null;
		} else if (grille.getAxe_y() < asp.getPosy()) {
			System.out.print("L'axe y est inferieur a la pos y");
			return null;
		} else if (asp.getorientaion() != "N" && asp.getorientaion() != "W" && asp.getorientaion() != "S"
				&& asp.getorientaion() != "E") {
			System.out.print("Le lettre d'orientation doit etre N ou W ou S ou E ");
			return null;
		} else {
			return asp;
		}
	}

	@Override
	public void Avance(String s, Aspirateur asp, Grille grille) {
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {

			if (!"A".equals(arr[i]) && !"G".equals(arr[i]) && !"D".equals(arr[i])) {
				// System.out.print(arr[i]);
				System.out.print("Seulement les characteres A,G,D sont autorisé");
				return;
			} else if (arr[i].equals("A")) {
				if (asp.getPosx() > grille.getAxe_x() || asp.getPosy() > grille.getAxe_y()) {
					System.out.print("L'aspirateur est est hors de grille");
					return;
				} else if (asp.getorientaion().equals("N")) {
					asp.setPosy(asp.getPosy() + 1);
				} else if (asp.getorientaion().equals("S")) {
					asp.setPosy(asp.getPosy() - 1);
				} else if (asp.getorientaion().equals("W")) {
					asp.setPosy(asp.getPosx() + 1);
				} else if (asp.getorientaion().equals("E")) {
					asp.setPosy(asp.getPosx() - 1);
				}
			} else if (arr[i].equals("G")) {
				if (asp.getorientaion().equals("N")) {
					asp.setorientaion("W");
				} else if (asp.getorientaion().equals("S")) {
					asp.setorientaion("E");
				} else if (asp.getorientaion().equals("W")) {
					asp.setorientaion("N");
				} else if (asp.getorientaion().equals("E")) {
					asp.setorientaion("S");
				}
			} else if (arr[i].equals("D")) {
				if (asp.getorientaion().equals("N")) {
					asp.setorientaion("E");
				} else if (asp.getorientaion().equals("S")) {
					asp.setorientaion("W");
				} else if (asp.getorientaion().equals("W")) {
					asp.setorientaion("S");
				} else if (asp.getorientaion().equals("E")) {
					asp.setorientaion("N");
				}
			}

		}
		System.out.printf("x =" + asp.getPosx() + " y =" + asp.getPosy() + " orientation=" + asp.getorientaion());

	}

}
