
package proxy.proxyLogin;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxyLogin package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _DemandeConge_QNAME = new QName("http://Controllers.cooolab.management.com/", "DemandeConge");
    private static final QName _Departement_QNAME = new QName("http://Controllers.cooolab.management.com/", "Departement");
    private static final QName _User_QNAME = new QName("http://Controllers.cooolab.management.com/", "User");
    private static final QName _LoginUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "loginUser");
    private static final QName _LoginUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "loginUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxyLogin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DemandeConge }
     * 
     * @return
     *     the new instance of {@link DemandeConge }
     */
    public DemandeConge createDemandeConge() {
        return new DemandeConge();
    }

    /**
     * Create an instance of {@link Departement }
     * 
     * @return
     *     the new instance of {@link Departement }
     */
    public Departement createDepartement() {
        return new Departement();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     * @return
     *     the new instance of {@link LoginUser }
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     * @return
     *     the new instance of {@link LoginUserResponse }
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandeConge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DemandeConge }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "DemandeConge")
    public JAXBElement<DemandeConge> createDemandeConge(DemandeConge value) {
        return new JAXBElement<>(_DemandeConge_QNAME, DemandeConge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Departement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Departement }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "Departement")
    public JAXBElement<Departement> createDepartement(Departement value) {
        return new JAXBElement<>(_Departement_QNAME, Departement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

}
