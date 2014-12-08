
package si.um.feri.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Kalkulator", targetNamespace = "http://ws.feri.um.si/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Kalkulator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mnozi", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.Mnozi")
    @ResponseWrapper(localName = "mnoziResponse", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.MnoziResponse")
    public int mnozi(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<si.um.feri.gen.Racun>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obdelaj", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.Obdelaj")
    @ResponseWrapper(localName = "obdelajResponse", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.ObdelajResponse")
    public List<Racun> obdelaj(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deli", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.Deli")
    @ResponseWrapper(localName = "deliResponse", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.DeliResponse")
    public int deli(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "odstej", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.Odstej")
    @ResponseWrapper(localName = "odstejResponse", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.OdstejResponse")
    public int odstej(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sestej", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.Sestej")
    @ResponseWrapper(localName = "sestejResponse", targetNamespace = "http://ws.feri.um.si/", className = "si.um.feri.gen.SestejResponse")
    public int sestej(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}