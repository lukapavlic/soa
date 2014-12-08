package si.um.feri.ws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import si.um.feri.ejb.Racun;

@WebService
public class Kalkulator {

	@EJB
	si.um.feri.ejb.Kalkulator ejb;
	
	public int sestej(int a, int b) {
		return ejb.sestej(a, b);
	}

	public int odstej(int a, int b) {
		return ejb.odstej(a, b);
	}
	
	public int mnozi(int a, int b) {
		return ejb.mnozi(a, b);
	}
	
	public int deli(int a, int b) {
		return ejb.deli(a, b);
	}
	
	public List<Racun> obdelaj(int a, int b) {
		return ejb.obdelaj(a, b);
	}
	
}