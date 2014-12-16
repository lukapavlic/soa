package si.um.feri.jsf;

import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import si.um.feri.ejb.Racun;

@ManagedBean(name="kalk")
@SessionScoped
public class KalkulatorManagedJSFBean {

	@EJB
	si.um.feri.ejb.Kalkulator ejb;
	
	private int a=0;
	
	private int b=0;
	
	private int rez=0;
	
	public Collection<Racun> getVsiRacuni() {
		return ejb.obdelaj(a, b);
	}
	
	public void sestej(ActionEvent ae) {
		rez=ejb.sestej(a, b);
	}
	
	public void odstej(ActionEvent ae) {
		rez=ejb.odstej(a, b);
	}
	
	public void mnozi(ActionEvent ae) {
		rez=ejb.mnozi(a, b);
	}

	public void deli(ActionEvent ae) {
		rez=ejb.deli(a, b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getRez() {
		return rez;
	}

	public void setRez(int rez) {
		this.rez = rez;
	}
	
}