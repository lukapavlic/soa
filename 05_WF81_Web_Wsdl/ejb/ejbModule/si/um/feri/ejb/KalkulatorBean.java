package si.um.feri.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class KalkulatorBean implements Kalkulator {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public int sestej(int a, int b) {
		em.persist(new Racun(a+"+"+b, a+b));
		return a+b;
	}

	@Override
	public int odstej(int a, int b) {
		em.persist(new Racun(a+"-"+b, a-b));
		return a-b;
	}
	
	@Override
	public int mnozi(int a, int b) {
		em.persist(new Racun(a+"*"+b, a*b));
		return a*b;
	}
	
	@Override
	public int deli(int a, int b) {
		em.persist(new Racun(a+"/"+b, a/b));
		return a/b;
	}
	
	@Override
	public List<Racun> obdelaj(int a, int b) {
		List<Racun> ret=new ArrayList<Racun>();
		ret.add(new Racun(a+"+"+b, sestej(a, b)));
		ret.add(new Racun(a+"-"+b, odstej(a, b)));
		ret.add(new Racun(a+"*"+b, mnozi(a, b)));
		ret.add(new Racun(a+"/"+b, deli(a, b)));
		return ret;
	}
	
	@Override
	public List<Racun> zgodovina() {
		return em.createQuery("select r from Racun r").getResultList();
	}
	
}