
package com.soap.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _AddAmount_QNAME = new QName("http://ws/", "addAmount");
    private final static QName _AddAmountResponse_QNAME = new QName("http://ws/", "addAmountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAmount }
     * 
     */
    public AddAmount createAddAmount() {
        return new AddAmount();
    }

    /**
     * Create an instance of {@link AddAmountResponse }
     * 
     */
    public AddAmountResponse createAddAmountResponse() {
        return new AddAmountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addAmount")
    public JAXBElement<AddAmount> createAddAmount(AddAmount value) {
        return new JAXBElement<AddAmount>(_AddAmount_QNAME, AddAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addAmountResponse")
    public JAXBElement<AddAmountResponse> createAddAmountResponse(AddAmountResponse value) {
        return new JAXBElement<AddAmountResponse>(_AddAmountResponse_QNAME, AddAmountResponse.class, null, value);
    }

}
