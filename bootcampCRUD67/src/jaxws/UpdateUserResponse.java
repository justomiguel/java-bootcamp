
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateUserResponse", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUserResponse", namespace = "http://bootcamp.com/")
public class UpdateUserResponse {

    @XmlElement(name = "return", namespace = "")
    private com.bootcamp.User _return;

    /**
     * 
     * @return
     *     returns User
     */
    public com.bootcamp.User getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.bootcamp.User _return) {
        this._return = _return;
    }

}
