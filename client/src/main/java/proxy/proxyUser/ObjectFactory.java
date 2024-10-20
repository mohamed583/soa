
package proxy.proxyUser;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy.proxyUser package. 
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

    private static final QName _DeleteUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "DeleteUser");
    private static final QName _DeleteUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "DeleteUserResponse");
    private static final QName _DemandeConge_QNAME = new QName("http://Controllers.cooolab.management.com/", "DemandeConge");
    private static final QName _Departement_QNAME = new QName("http://Controllers.cooolab.management.com/", "Departement");
    private static final QName _EditUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "EditUser");
    private static final QName _EditUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "EditUserResponse");
    private static final QName _ListUsers_QNAME = new QName("http://Controllers.cooolab.management.com/", "ListUsers");
    private static final QName _ListUsersResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "ListUsersResponse");
    private static final QName _SaveDemandeConge_QNAME = new QName("http://Controllers.cooolab.management.com/", "SaveDemandeConge");
    private static final QName _SaveDemandeCongeResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "SaveDemandeCongeResponse");
    private static final QName _SaveUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "SaveUser");
    private static final QName _SaveUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "SaveUserResponse");
    private static final QName _ShowUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "ShowUser");
    private static final QName _ShowUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "ShowUserResponse");
    private static final QName _UpdateUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "UpdateUser");
    private static final QName _UpdateUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "UpdateUserResponse");
    private static final QName _User_QNAME = new QName("http://Controllers.cooolab.management.com/", "User");
    private static final QName _AddUser_QNAME = new QName("http://Controllers.cooolab.management.com/", "addUser");
    private static final QName _AddUserResponse_QNAME = new QName("http://Controllers.cooolab.management.com/", "addUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy.proxyUser
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     * @return
     *     the new instance of {@link DeleteUser }
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     * @return
     *     the new instance of {@link DeleteUserResponse }
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
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
     * Create an instance of {@link EditUser }
     * 
     * @return
     *     the new instance of {@link EditUser }
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     * @return
     *     the new instance of {@link EditUserResponse }
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link ListUsers }
     * 
     * @return
     *     the new instance of {@link ListUsers }
     */
    public ListUsers createListUsers() {
        return new ListUsers();
    }

    /**
     * Create an instance of {@link ListUsersResponse }
     * 
     * @return
     *     the new instance of {@link ListUsersResponse }
     */
    public ListUsersResponse createListUsersResponse() {
        return new ListUsersResponse();
    }

    /**
     * Create an instance of {@link SaveDemandeConge }
     * 
     * @return
     *     the new instance of {@link SaveDemandeConge }
     */
    public SaveDemandeConge createSaveDemandeConge() {
        return new SaveDemandeConge();
    }

    /**
     * Create an instance of {@link SaveDemandeCongeResponse }
     * 
     * @return
     *     the new instance of {@link SaveDemandeCongeResponse }
     */
    public SaveDemandeCongeResponse createSaveDemandeCongeResponse() {
        return new SaveDemandeCongeResponse();
    }

    /**
     * Create an instance of {@link ShowUser }
     * 
     * @return
     *     the new instance of {@link ShowUser }
     */
    public ShowUser createShowUser() {
        return new ShowUser();
    }

    /**
     * Create an instance of {@link ShowUserResponse }
     * 
     * @return
     *     the new instance of {@link ShowUserResponse }
     */
    public ShowUserResponse createShowUserResponse() {
        return new ShowUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     * @return
     *     the new instance of {@link UpdateUser }
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     * @return
     *     the new instance of {@link UpdateUserResponse }
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link User_Type }
     * 
     * @return
     *     the new instance of {@link User_Type }
     */
    public User_Type createUser_Type() {
        return new User_Type();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     * @return
     *     the new instance of {@link AddUser }
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     * @return
     *     the new instance of {@link AddUserResponse }
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "DeleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "DeleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "EditUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "EditUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "ListUsers")
    public JAXBElement<ListUsers> createListUsers(ListUsers value) {
        return new JAXBElement<>(_ListUsers_QNAME, ListUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "ListUsersResponse")
    public JAXBElement<ListUsersResponse> createListUsersResponse(ListUsersResponse value) {
        return new JAXBElement<>(_ListUsersResponse_QNAME, ListUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDemandeConge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveDemandeConge }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "SaveDemandeConge")
    public JAXBElement<SaveDemandeConge> createSaveDemandeConge(SaveDemandeConge value) {
        return new JAXBElement<>(_SaveDemandeConge_QNAME, SaveDemandeConge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDemandeCongeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveDemandeCongeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "SaveDemandeCongeResponse")
    public JAXBElement<SaveDemandeCongeResponse> createSaveDemandeCongeResponse(SaveDemandeCongeResponse value) {
        return new JAXBElement<>(_SaveDemandeCongeResponse_QNAME, SaveDemandeCongeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDemandeConge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveDemandeConge }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "SaveUser")
    public JAXBElement<SaveDemandeConge> createSaveUser(SaveDemandeConge value) {
        return new JAXBElement<>(_SaveUser_QNAME, SaveDemandeConge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDemandeCongeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveDemandeCongeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "SaveUserResponse")
    public JAXBElement<SaveDemandeCongeResponse> createSaveUserResponse(SaveDemandeCongeResponse value) {
        return new JAXBElement<>(_SaveUserResponse_QNAME, SaveDemandeCongeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "ShowUser")
    public JAXBElement<ShowUser> createShowUser(ShowUser value) {
        return new JAXBElement<>(_ShowUser_QNAME, ShowUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "ShowUserResponse")
    public JAXBElement<ShowUserResponse> createShowUserResponse(ShowUserResponse value) {
        return new JAXBElement<>(_ShowUserResponse_QNAME, ShowUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "UpdateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "UpdateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "User")
    public JAXBElement<User_Type> createUser(User_Type value) {
        return new JAXBElement<>(_User_QNAME, User_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Controllers.cooolab.management.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

}
