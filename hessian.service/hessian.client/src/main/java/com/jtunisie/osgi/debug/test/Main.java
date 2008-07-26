/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jtunisie.osgi.debug.test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.jtunisie.osgi.hessian.IService;
import com.jtunisie.osgi.hessian.exceptions.ServiceException;
import java.net.MalformedURLException;

/**
 *
 * @author slim
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException, ServiceException {
        HessianProxyFactory factory = new HessianProxyFactory();
        IService service = (IService) factory.create(IService.class, "http://localhost:8080/jtunisie");
        System.out.println(service.execute());
    }
}
