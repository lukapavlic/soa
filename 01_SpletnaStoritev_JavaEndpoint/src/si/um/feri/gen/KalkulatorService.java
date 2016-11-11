
package si.um.feri.gen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "KalkulatorService", targetNamespace = "http://feri.um.si/", wsdlLocation = "http://127.0.0.1:8888/kalkulator?wsdl")
public class KalkulatorService
    extends Service
{

    private final static URL KALKULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException KALKULATORSERVICE_EXCEPTION;
    private final static QName KALKULATORSERVICE_QNAME = new QName("http://feri.um.si/", "KalkulatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8888/kalkulator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KALKULATORSERVICE_WSDL_LOCATION = url;
        KALKULATORSERVICE_EXCEPTION = e;
    }

    public KalkulatorService() {
        super(__getWsdlLocation(), KALKULATORSERVICE_QNAME);
    }

    public KalkulatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), KALKULATORSERVICE_QNAME, features);
    }

    public KalkulatorService(URL wsdlLocation) {
        super(wsdlLocation, KALKULATORSERVICE_QNAME);
    }

    public KalkulatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KALKULATORSERVICE_QNAME, features);
    }

    public KalkulatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KalkulatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Kalkulator
     */
    @WebEndpoint(name = "KalkulatorPort")
    public Kalkulator getKalkulatorPort() {
        return super.getPort(new QName("http://feri.um.si/", "KalkulatorPort"), Kalkulator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Kalkulator
     */
    @WebEndpoint(name = "KalkulatorPort")
    public Kalkulator getKalkulatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://feri.um.si/", "KalkulatorPort"), Kalkulator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KALKULATORSERVICE_EXCEPTION!= null) {
            throw KALKULATORSERVICE_EXCEPTION;
        }
        return KALKULATORSERVICE_WSDL_LOCATION;
    }

}
