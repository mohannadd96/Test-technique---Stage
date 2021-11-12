package yanport.dev.spring.service;

import yanport.dev.spring.entity.Aspirateur;
import yanport.dev.spring.entity.Grille;

public interface IAspirateurService {

	public Aspirateur Init(Aspirateur asp, Grille grille);

	public void Avance(String s, Aspirateur asp, Grille grille);

}
