
package proxy.proxyUser;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "User", targetNamespace = "http://Controllers.cooolab.management.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface User {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<proxy.proxyUser.DemandeConge>
     */
    @WebMethod(operationName = "ShowUserDemandeConge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ShowUserDemandeConge", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ShowUserDemandeConge")
    @ResponseWrapper(localName = "ShowUserDemandeCongeResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ShowUserDemandeCongeResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/ShowUserDemandeCongeRequest", output = "http://Controllers.cooolab.management.com/User/ShowUserDemandeCongeResponse")
    public List<DemandeConge> showUserDemandeConge(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns proxy.proxyUser.User_Type
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.AddUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/addUserRequest", output = "http://Controllers.cooolab.management.com/User/addUserResponse")
    public User_Type addUser();

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @param arg4
     */
    @WebMethod(operationName = "SaveUser")
    @RequestWrapper(localName = "SaveUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.SaveUser")
    @ResponseWrapper(localName = "SaveUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.SaveUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/SaveUserRequest", output = "http://Controllers.cooolab.management.com/User/SaveUserResponse")
    public void saveUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.proxyUser.User_Type
     */
    @WebMethod(operationName = "ListUser")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ListUser")
    @ResponseWrapper(localName = "ListUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ListUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/ListUserRequest", output = "http://Controllers.cooolab.management.com/User/ListUserResponse")
    public User_Type listUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod(operationName = "ListUsers")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListUsers", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ListUsers")
    @ResponseWrapper(localName = "ListUsersResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ListUsersResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/ListUsersRequest", output = "http://Controllers.cooolab.management.com/User/ListUsersResponse")
    public List<Integer> listUsers();

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.proxyUser.User_Type
     */
    @WebMethod(operationName = "EditUser")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EditUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.EditUser")
    @ResponseWrapper(localName = "EditUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.EditUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/EditUserRequest", output = "http://Controllers.cooolab.management.com/User/EditUserResponse")
    public User_Type editUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @param arg4
     */
    @WebMethod(operationName = "UpdateUser")
    @RequestWrapper(localName = "UpdateUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.UpdateUser")
    @ResponseWrapper(localName = "UpdateUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.UpdateUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/UpdateUserRequest", output = "http://Controllers.cooolab.management.com/User/UpdateUserResponse")
    public void updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "DeleteUser")
    @RequestWrapper(localName = "DeleteUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.DeleteUser")
    @ResponseWrapper(localName = "DeleteUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.DeleteUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/DeleteUserRequest", output = "http://Controllers.cooolab.management.com/User/DeleteUserResponse")
    public void deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.proxyUser.User_Type
     */
    @WebMethod(operationName = "ShowUser")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ShowUser", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ShowUser")
    @ResponseWrapper(localName = "ShowUserResponse", targetNamespace = "http://Controllers.cooolab.management.com/", className = "proxy.proxyUser.ShowUserResponse")
    @Action(input = "http://Controllers.cooolab.management.com/User/ShowUserRequest", output = "http://Controllers.cooolab.management.com/User/ShowUserResponse")
    public User_Type showUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
