package com.shop.delivery;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-12-30T12:30:29.963+01:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "DeliveryService",
                  wsdlLocation = "file:/home/wojtek/azu-projekt/delivery/src/main/resources/delivery.wsdl",
                  targetNamespace = "http://www.delivery.shop.com")
public class DeliveryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.delivery.shop.com", "DeliveryService");
    public final static QName DeliveryServicePort = new QName("http://www.delivery.shop.com", "DeliveryServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/wojtek/azu-projekt/delivery/src/main/resources/delivery.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DeliveryService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/wojtek/azu-projekt/delivery/src/main/resources/delivery.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DeliveryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeliveryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeliveryService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DeliveryService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DeliveryService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DeliveryService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Delivery
     */
    @WebEndpoint(name = "DeliveryServicePort")
    public Delivery getDeliveryServicePort() {
        return super.getPort(DeliveryServicePort, Delivery.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Delivery
     */
    @WebEndpoint(name = "DeliveryServicePort")
    public Delivery getDeliveryServicePort(WebServiceFeature... features) {
        return super.getPort(DeliveryServicePort, Delivery.class, features);
    }

}
