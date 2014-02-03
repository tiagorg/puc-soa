
package usingteste;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Teste", targetNamespace = "http://teste/", wsdlLocation = "http://localhost:8080/Testando/Teste?WSDL")
public class Teste
    extends Service
{

    private final static URL TESTE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(usingteste.Teste.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = usingteste.Teste.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/Testando/Teste?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/Testando/Teste?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TESTE_WSDL_LOCATION = url;
    }

    public Teste(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Teste() {
        super(TESTE_WSDL_LOCATION, new QName("http://teste/", "Teste"));
    }

    /**
     * 
     * @return
     *     returns Testando
     */
    @WebEndpoint(name = "TestandoPort")
    public Testando getTestandoPort() {
        return super.getPort(new QName("http://teste/", "TestandoPort"), Testando.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Testando
     */
    @WebEndpoint(name = "TestandoPort")
    public Testando getTestandoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://teste/", "TestandoPort"), Testando.class, features);
    }

}
