
package si.um.feri.gen.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the si.um.feri.gen.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NovoObvestilo_QNAME = new QName("http://feri.um.si/", "novoObvestilo");
    private final static QName _NovoObvestiloResponse_QNAME = new QName("http://feri.um.si/", "novoObvestiloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: si.um.feri.gen.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NovoObvestilo }
     * 
     */
    public NovoObvestilo createNovoObvestilo() {
        return new NovoObvestilo();
    }

    /**
     * Create an instance of {@link NovoObvestiloResponse }
     * 
     */
    public NovoObvestiloResponse createNovoObvestiloResponse() {
        return new NovoObvestiloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NovoObvestilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://feri.um.si/", name = "novoObvestilo")
    public JAXBElement<NovoObvestilo> createNovoObvestilo(NovoObvestilo value) {
        return new JAXBElement<NovoObvestilo>(_NovoObvestilo_QNAME, NovoObvestilo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NovoObvestiloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://feri.um.si/", name = "novoObvestiloResponse")
    public JAXBElement<NovoObvestiloResponse> createNovoObvestiloResponse(NovoObvestiloResponse value) {
        return new JAXBElement<NovoObvestiloResponse>(_NovoObvestiloResponse_QNAME, NovoObvestiloResponse.class, null, value);
    }

}
