package si.um.feri;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import si.um.feri.gen.server.KalkulatorService;

public class Odjemalec {

	@WebService
	public class StoritevZaObvestila {
		public void novoObvestilo(String sporocilo) {
			System.out.println("Strežnik javlja: "+sporocilo);
		}
	}
	
	private String zagonStoritve() {
		//objavi na prvi prost port
		int port=8880;
		String url="http://127.0.0.1:"+port+"/storitev";
		boolean ok=false;
		do {
			port++;
			url="http://127.0.0.1:"+port+"/storitev";
			try {
				Endpoint.publish(url, new StoritevZaObvestila());
				ok=true;
			} catch (Exception e) {
			}
		} while (!ok);
		
		return url;
	}
	
	public void odjemalec() {

		si.um.feri.gen.server.Kalkulator kalk=new KalkulatorService().getKalkulatorPort();
		
		String mojaStoritev=zagonStoritve();
		System.out.println(mojaStoritev);
		
		kalk.narociNaObvestila(mojaStoritev+"?wsdl");
		
		System.out.println(kalk.sestej(10,3));
		System.out.println(kalk.odstej(10,3));
		System.out.println(kalk.mnozi(10,3));
		System.out.println(kalk.deli(10,3));
		
		//nekoè kasneje
		//kalk.odjaviOdObvestil(mojaStoritev);
		
	}
	
	public static void main(String[] args) {
		new Odjemalec().odjemalec();
	}

}
