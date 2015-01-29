
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "uploadPhotoResponse", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadPhotoResponse", namespace = "http://bootcamp.com/")
public class UploadPhotoResponse {

    @XmlElement(name = "return", namespace = "")
    private com.bootcamp.Photo _return;

    /**
     * 
     * @return
     *     returns Photo
     */
    public com.bootcamp.Photo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.bootcamp.Photo _return) {
        this._return = _return;
    }

}
