
package proxy.proxyLogin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour user complex type.</p>
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="user">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="manager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="departement" type="{http://Controllers.cooolab.management.com/}departement" minOccurs="0"/>
 *         <element name="demandesConges" type="{http://Controllers.cooolab.management.com/}demandeConge" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "id",
    "email",
    "manager",
    "hr",
    "password",
    "departement",
    "demandesConges"
})
public class User {

    protected int id;
    protected String email;
    protected boolean manager;
    protected boolean hr;
    protected String password;
    protected Departement departement;
    @XmlElement(nillable = true)
    protected List<DemandeConge> demandesConges;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * D�finit la valeur de la propri�t� email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propri�t� manager.
     * 
     */
    public boolean isManager() {
        return manager;
    }

    /**
     * D�finit la valeur de la propri�t� manager.
     * 
     */
    public void setManager(boolean value) {
        this.manager = value;
    }

    /**
     * Obtient la valeur de la propri�t� hr.
     * 
     */
    public boolean isHr() {
        return hr;
    }

    /**
     * D�finit la valeur de la propri�t� hr.
     * 
     */
    public void setHr(boolean value) {
        this.hr = value;
    }

    /**
     * Obtient la valeur de la propri�t� password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * D�finit la valeur de la propri�t� password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propri�t� departement.
     * 
     * @return
     *     possible object is
     *     {@link Departement }
     *     
     */
    public Departement getDepartement() {
        return departement;
    }

    /**
     * D�finit la valeur de la propri�t� departement.
     * 
     * @param value
     *     allowed object is
     *     {@link Departement }
     *     
     */
    public void setDepartement(Departement value) {
        this.departement = value;
    }

    /**
     * Gets the value of the demandesConges property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandesConges property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDemandesConges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemandeConge }
     * </p>
     * 
     * 
     * @return
     *     The value of the demandesConges property.
     */
    public List<DemandeConge> getDemandesConges() {
        if (demandesConges == null) {
            demandesConges = new ArrayList<>();
        }
        return this.demandesConges;
    }

}
