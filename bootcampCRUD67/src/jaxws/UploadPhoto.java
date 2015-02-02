
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "uploadPhoto", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadPhoto", namespace = "http://bootcamp.com/", propOrder = {
    "account",
    "photoURL"
})
public class UploadPhoto {

    @XmlElement(name = "Account", namespace = "")
    private String account;
    @XmlElement(name = "photoURL", namespace = "")
    private String photoURL;

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
    public String getPhotoURL() {
        return this.photoURL;
    }

    /**
     * 
     * @param photoURL
     *     the value for the photoURL property
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

}
