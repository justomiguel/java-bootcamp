/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.bootcamp.UserServiceInterface;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Santiago
 */
public class ClientTesting {
  public static void main(String[] args) throws Exception {
 
	URL url = new URL("http://localhost:8080/bootcamp/userservice?wsdl");
        QName qname = new QName("http://bootcamp.com/", "UserServiceService");
 
        Service service = Service.create(url, qname);
 
        UserServiceInterface hello = service.getPort(UserServiceInterface.class);
        
        hello.createUser("otracuenta15", "password213", "minom", "miap");
        hello.createUser("otracuenta16", "password213", "minom", "miap");
        hello.createUser("otracuenta17", "password213", "minom", "miap");
                
        System.out.println(hello.addFriend("otracuenta17", "otracuenta15"));
        System.out.println(hello.uploadPhoto("otracuenta15", "www.mipagina.com/mifoto.jpeg"));
        
        System.out.println(hello.likePhoto("www.mipagina.com/mifoto.jpeg"));
        System.out.println(hello.likePhoto("www.mipagina.com/mifoto.jpeg"));
        System.out.println(hello.likePhoto("www.mipagina.com/mifoto.jpeg"));
        System.out.println(hello.likePhoto("www.mipagina.com/mifoto.jpeg"));
        System.out.println(hello.likePhoto("www.mipagina.com/mifoto.jpeg"));
    }
 
}  

