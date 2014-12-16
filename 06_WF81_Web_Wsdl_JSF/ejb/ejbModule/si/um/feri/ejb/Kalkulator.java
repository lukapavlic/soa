package si.um.feri.ejb;

import java.util.List;
import javax.ejb.Local;

@Local
public interface Kalkulator {

	int sestej(int a, int b);

	int odstej(int a, int b);

	int mnozi(int a, int b);

	int deli(int a, int b);

	List<Racun> obdelaj(int a, int b);

	List<Racun> zgodovina();
	
}