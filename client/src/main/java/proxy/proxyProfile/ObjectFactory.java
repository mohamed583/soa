
package proxy.proxyProfile;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy.proxyProfile package. 
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
    private static final QName _EditProfile_QNAME = new QName("http://Controllers.cooolab.management.com/", "editProfile");
    private static final QName _EditProfileResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "editProfileResponse");
    private static final QName _UpdateProfile_QNAME = new QName("http://Controllers.cooolab.management.com/", "updateProfile");
    private static final QName _UpdateProfileResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "updateProfileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy.proxyProfile
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
     * Create an instance of {@link EditProfile }
     * 
     * @return
     *     the new instance of {@link EditProfile }
     */
    public EditProfile createEditProfile() {
        return new EditProfile();
    }

    /**
     * Create an instance of {@link EditProfileResponse }
     * 
     * @return
     *     the new instance of {@link EditProfileResponse }
     */
    public EditProfileResponse createEditProfileResponse() {
        return new EditProfileResponse();
    }

    /**
     * Create an instance of {@link UpdateProfile }
     * 
     * @return
     *     the new instance of {@link UpdateProfile }
     */
    public UpdateProfile createUpdateProfile() {
        return new UpdateProfile();
    }

    /**
     * Create an instance of {@link UpdateProfileResponse }
     * 
     * @return
     *     the new instance of {@link UpdateProfileResponse }
     */
    public UpdateProfileResponse createUpdateProfileResponse() {
        return new UpdateProfileResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "editProfile")
    public JAXBElement<EditProfile> createEditProfile(EditProfile value) {
        return new JAXBElement<>(_EditProfile_QNAME, EditProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProfileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditProfileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "editProfileResponse")
    public JAXBElement<EditProfileResponse> createEditProfileResponse(EditProfileResponse value) {
        return new JAXBElement<>(_EditProfileResponse_QNAME, EditProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "updateProfile")
    public JAXBElement<UpdateProfile> createUpdateProfile(UpdateProfile value) {
        return new JAXBElement<>(_UpdateProfile_QNAME, UpdateProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProfileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "updateProfileResponse")
    public JAXBElement<UpdateProfileResponse> createUpdateProfileResponse(UpdateProfileResponse value) {
        return new JAXBElement<>(_UpdateProfileResponse_QNAME, UpdateProfileResponse.class, null, value);
    }

}
