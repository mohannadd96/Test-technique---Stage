package yanport.dev.spring.entity;

import java.io.Serializable;

public class Grille implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3193550113898335159L;

	private long id;
	private int axe_x;
	private int axe_y;

	public Grille() {
		super();
	}

	public Grille(int axe_x, int axe_y) {
		super();
		this.axe_x = axe_x;
		this.axe_y = axe_y;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAxe_x() {
		return axe_x;
	}

	public void setAxe_x(int axe_x) {
		this.axe_x = axe_x;
	}

	public int getAxe_y() {
		return axe_y;
	}

	public void setAxe_y(int axe_y) {
		this.axe_y = axe_y;
	}

}
