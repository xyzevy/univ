
package org.gnuhpc.wsClient;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SayHelloService", targetNamespace = "http://wsServer.gnuhpc.org/", wsdlLocation = "http://localhost:8080/wsServerExample?wsdl")
public class SayHelloService
    extends Service
{

    private final static URL SAYHELLOSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAYHELLOSERVICE_EXCEPTION;
    private final static QName SAYHELLOSERVICE_QNAME = new QName("http://wsServer.gnuhpc.org/", "SayHelloService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wsServerExample?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAYHELLOSERVICE_WSDL_LOCATION = url;
        SAYHELLOSERVICE_EXCEPTION = e;
    }

    public SayHelloService() {
        super(__getWsdlLocation(), SAYHELLOSERVICE_QNAME);
    }

    public SayHelloService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAYHELLOSERVICE_QNAME, features);
    }

    public SayHelloService(URL wsdlLocation) {
        super(wsdlLocation, SAYHELLOSERVICE_QNAME);
    }

    public SayHelloService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAYHELLOSERVICE_QNAME, features);
    }

    public SayHelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayHelloService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SayHello
     */
    @WebEndpoint(name = "SayHelloPort")
    public SayHello getSayHelloPort() {
        return super.getPort(new QName("http://wsServer.gnuhpc.org/", "SayHelloPort"), SayHello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayHello
     */
    @WebEndpoint(name = "SayHelloPort")
    public SayHello getSayHelloPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsServer.gnuhpc.org/", "SayHelloPort"), SayHello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAYHELLOSERVICE_EXCEPTION!= null) {
            throw SAYHELLOSERVICE_EXCEPTION;
        }
        return SAYHELLOSERVICE_WSDL_LOCATION;
    }

}
