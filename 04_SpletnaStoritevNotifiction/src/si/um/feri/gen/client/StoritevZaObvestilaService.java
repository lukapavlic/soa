
package si.um.feri.gen.client;

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
@WebServiceClient(name = "StoritevZaObvestilaService", targetNamespace = "http://feri.um.si/", wsdlLocation = "http://127.0.0.1:8881/storitev?wsdl")
public class StoritevZaObvestilaService
    extends Service
{

    private final static URL STORITEVZAOBVESTILASERVICE_WSDL_LOCATION;
    private final static WebServiceException STORITEVZAOBVESTILASERVICE_EXCEPTION;
    private final static QName STORITEVZAOBVESTILASERVICE_QNAME = new QName("http://feri.um.si/", "StoritevZaObvestilaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8881/storitev?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STORITEVZAOBVESTILASERVICE_WSDL_LOCATION = url;
        STORITEVZAOBVESTILASERVICE_EXCEPTION = e;
    }

    public StoritevZaObvestilaService() {
        super(__getWsdlLocation(), STORITEVZAOBVESTILASERVICE_QNAME);
    }

    public StoritevZaObvestilaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STORITEVZAOBVESTILASERVICE_QNAME, features);
    }

    public StoritevZaObvestilaService(URL wsdlLocation) {
        super(wsdlLocation, STORITEVZAOBVESTILASERVICE_QNAME);
    }

    public StoritevZaObvestilaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STORITEVZAOBVESTILASERVICE_QNAME, features);
    }

    public StoritevZaObvestilaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StoritevZaObvestilaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StoritevZaObvestila
     */
    @WebEndpoint(name = "StoritevZaObvestilaPort")
    public StoritevZaObvestila getStoritevZaObvestilaPort() {
        return super.getPort(new QName("http://feri.um.si/", "StoritevZaObvestilaPort"), StoritevZaObvestila.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StoritevZaObvestila
     */
    @WebEndpoint(name = "StoritevZaObvestilaPort")
    public StoritevZaObvestila getStoritevZaObvestilaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://feri.um.si/", "StoritevZaObvestilaPort"), StoritevZaObvestila.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STORITEVZAOBVESTILASERVICE_EXCEPTION!= null) {
            throw STORITEVZAOBVESTILASERVICE_EXCEPTION;
        }
        return STORITEVZAOBVESTILASERVICE_WSDL_LOCATION;
    }

}
