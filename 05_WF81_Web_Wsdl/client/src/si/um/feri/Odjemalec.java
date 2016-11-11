package si.um.feri;

import java.net.URL;
import si.um.feri.gen.Kalkulator;
import si.um.feri.gen.KalkulatorService;

public class Odjemalec {

	public static void main(String[] args) throws Exception {

//		String wsdl="http://164.8.251.196:8080/05_WildFly81_Web_WsdlWeb/Kalkulator?wsdl";
		String wsdl="http://localhost:8080/05_WildFly81_Web_WsdlWeb/Kalkulator?wsdl";
			
		Kalkulator kalk=new KalkulatorService(new URL(wsdl)).getKalkulatorPort();
		//Kalkulator kalk=new KalkulatorService().getKalkulatorPort();
		
		System.out.println(kalk.sestej(10,3));
		System.out.println(kalk.odstej(10,3));
		System.out.println(kalk.mnozi(10,3));
		System.out.println(kalk.deli(10,3));
		
		System.out.println(kalk.obdelaj(10,3));
		
	}

}
