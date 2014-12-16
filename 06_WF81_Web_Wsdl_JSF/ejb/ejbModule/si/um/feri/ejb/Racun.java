package si.um.feri.ejb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Racun {
	
	public Racun() {
		this("",0);
	}

	public Racun(String racun, int rezultat) {
		this.racun = racun;
		this.rezultat = rezultat;
	}

	private int id;
	
	private String racun;
	
	private int rezultat;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRacun() {
		return racun;
	}

	public void setRacun(String racun) {
		this.racun = racun;
	}

	public int getRezultat() {
		return rezultat;
	}

	public void setRezultat(int rezultat) {
		this.rezultat = rezultat;
	}
	
}
