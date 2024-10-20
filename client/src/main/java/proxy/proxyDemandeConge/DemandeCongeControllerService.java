
package proxy.proxyDemandeConge;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "DemandeCongeControllerService", targetNamespace = "http://Controllers.cooolab.management.com/", wsdlLocation = "http://127.0.0.1:8091/demandeConge?wsdl")
public class DemandeCongeControllerService
    extends Service
{

    private static final URL DEMANDECONGECONTROLLERSERVICE_WSDL_LOCATION;
    private static final WebServiceException DEMANDECONGECONTROLLERSERVICE_EXCEPTION;
    private static final QName DEMANDECONGECONTROLLERSERVICE_QNAME = new QName("http://Controllers.cooolab.management.com/", "DemandeCongeControllerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8091/demandeConge?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEMANDECONGECONTROLLERSERVICE_WSDL_LOCATION = url;
        DEMANDECONGECONTROLLERSERVICE_EXCEPTION = e;
    }

    public DemandeCongeControllerService() {
        super(__getWsdlLocation(), DEMANDECONGECONTROLLERSERVICE_QNAME);
    }

    public DemandeCongeControllerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEMANDECONGECONTROLLERSERVICE_QNAME, features);
    }

    public DemandeCongeControllerService(URL wsdlLocation) {
        super(wsdlLocation, DEMANDECONGECONTROLLERSERVICE_QNAME);
    }

    public DemandeCongeControllerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEMANDECONGECONTROLLERSERVICE_QNAME, features);
    }

    public DemandeCongeControllerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DemandeCongeControllerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DemandeConge
     */
    @WebEndpoint(name = "DemandeCongePort")
    public DemandeConge getDemandeCongePort() {
        return super.getPort(new QName("http://Controllers.cooolab.management.com/", "DemandeCongePort"), DemandeConge.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DemandeConge
     */
    @WebEndpoint(name = "DemandeCongePort")
    public DemandeConge getDemandeCongePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Controllers.cooolab.management.com/", "DemandeCongePort"), DemandeConge.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEMANDECONGECONTROLLERSERVICE_EXCEPTION!= null) {
            throw DEMANDECONGECONTROLLERSERVICE_EXCEPTION;
        }
        return DEMANDECONGECONTROLLERSERVICE_WSDL_LOCATION;
    }

}
