
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "readUser", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readUser", namespace = "http://bootcamp.com/")
public class ReadUser {

    @XmlElement(name = "Account", namespace = "")
    private String account;

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

}
