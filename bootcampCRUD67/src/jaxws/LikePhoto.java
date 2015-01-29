
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "likePhoto", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "likePhoto", namespace = "http://bootcamp.com/")
public class LikePhoto {

    @XmlElement(name = "photoURL", namespace = "")
    private String photoURL;

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
