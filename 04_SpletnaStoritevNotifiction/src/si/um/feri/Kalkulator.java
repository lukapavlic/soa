package si.um.feri;

import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.jws.WebService;

import si.um.feri.gen.client.StoritevZaObvestila;
import si.um.feri.gen.client.StoritevZaObvestilaService;

@WebService
public class Kalkulator {

	public int sestej(int a, int b) {
		String info="Sestevam "+a+" in "+b;
		System.out.println(info);
		obvestiVseZainteresirane(info);
		return a+b;
	}

	public int odstej(int a, int b) {
		String info="Odštevam "+a+" in "+b;
		System.out.println(info);
		obvestiVseZainteresirane(info);
		return a-b;
	}

	public int mnozi(int a, int b) {
		String info="Množim "+a+" in "+b;
		System.out.println(info);
		obvestiVseZainteresirane(info);
		return a*b;
	}
	
	public int deli(int a, int b) {
		String info="Delim "+a+" in "+b;
		System.out.println(info);
		obvestiVseZainteresirane(info);
		return a/b;
	}

	//obvešèanje odjemalcev o dogajanju

	private Set<String> callBacks=new HashSet<String>();

	public void narociNaObvestila(String odjemalec) {
		System.out.println("Na obvestila se naroèa: "+odjemalec);
		callBacks.add(odjemalec);
	}

	public void odjaviOdObvestil(String odjemalec) {
		System.out.println("Od obvestil se odjavlja: "+odjemalec);
		callBacks.remove(odjemalec);
	}
	
	private void obvestiVseZainteresirane(String obvestilo) {
		for (Iterator<String> it = callBacks.iterator(); it.hasNext();) {
			String s = it.next();
			try {
				StoritevZaObvestila st=new StoritevZaObvestilaService(new URL(s)).getStoritevZaObvestilaPort();
				st.novoObvestilo(obvestilo);
			} catch (Exception e) {
				//umik listenereja - oèitno veè ni živ
				it.remove();
			}
		}
	}
	
}