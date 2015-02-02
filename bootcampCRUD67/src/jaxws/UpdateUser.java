
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateUser", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUser", namespace = "http://bootcamp.com/", propOrder = {
    "account",
    "password",
    "name",
    "surname"
})
public class UpdateUser {

    @XmlElement(name = "Account", namespace = "")
    private String account;
    @XmlElement(name = "Password", namespace = "")
    private String password;
    @XmlElement(name = "Name", namespace = "")
    private String name;
    @XmlElement(name = "Surname", namespace = "")
    private String surname;

    /**
     * 
     * @return
     *     returns String
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * 
     * @param account
     *     the value for the account property
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 
     * @param password
     *     the value for the password property
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * 
     * @param surname
     *     the value for the surname property
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

}
