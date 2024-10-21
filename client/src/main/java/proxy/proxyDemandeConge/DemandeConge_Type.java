
package proxy.proxyDemandeConge;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour demandeConge complex type.</p>
 *
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.</p>
 *
 * <pre>{@code
 * <complexType name="demandeConge">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="employee" type="{http://Controllers.cooolab.management.com/}user" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandeConge", propOrder = {
    "id",
    "startDate",
    "endDate",
    "status",
    "employee"
})
public class DemandeConge_Type {

    protected int id;
    @XmlSchemaType(name = "dateTime")
    protected String startDate;
    @XmlSchemaType(name = "dateTime")
    protected String endDate;
    protected String status;
    protected User employee;

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
     * Obtient la valeur de la propri�t� startDate.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� endDate.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * D�finit la valeur de la propri�t� endDate.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * D�finit la valeur de la propri�t� status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propri�t� employee.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getEmployee() {
        return employee;
    }

    /**
     * D�finit la valeur de la propri�t� employee.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setEmployee(User value) {
        this.employee = value;
    }

}
