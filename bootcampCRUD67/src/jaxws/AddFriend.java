
package com.bootcamp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addFriend", namespace = "http://bootcamp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addFriend", namespace = "http://bootcamp.com/", propOrder = {
    "account",
    "friendAccount"
})
public class AddFriend {

    @XmlElement(name = "Account", namespace = "")
    private String account;
    @XmlElement(name = "FriendAccount", namespace = "")
    private String friendAccount;

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
    public String getFriendAccount() {
        return this.friendAccount;
    }

    /**
     * 
     * @param friendAccount
     *     the value for the friendAccount property
     */
    public void setFriendAccount(String friendAccount) {
        this.friendAccount = friendAccount;
    }

}
