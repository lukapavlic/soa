package si.um.feri;

import javax.xml.ws.Endpoint;

public class Streznik {
 
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8888/kalkulator", new Kalkulator());
		
		System.out.println("WSDL je na voljo na http://127.0.0.1:8888/kalkulator?wsdl");
	}

}