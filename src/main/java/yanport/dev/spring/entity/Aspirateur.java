package yanport.dev.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Aspirateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6405334855579504661L;
	
	private long id;
	private int posx;
	private int posy;
	private String orientaion;
	
	
	public Aspirateur() {
		super();
	}


	public Aspirateur(int posx, int posy, String orientaion) {
		super();
		this.posx = posx;
		this.posy = posy;
		this.orientaion = orientaion;
	}
	
	


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getPosx() {
		return posx;
	}


	public void setPosx(int posx) {
		this.posx = posx;
	}


	public int getPosy() {
		return posy;
	}


	public void setPosy(int posy) {
		this.posy = posy;
	}


	public String getorientaion() {
		return orientaion;
	}


	public void setorientaion(String orientaion) {
		this.orientaion = orientaion;
	}


	@Override
	public String toString() {
		return "Aspirateur [posx=" + posx + ", posy=" + posy + ", orientaion=" + orientaion + "]";
	}
	
	
	
	
}
