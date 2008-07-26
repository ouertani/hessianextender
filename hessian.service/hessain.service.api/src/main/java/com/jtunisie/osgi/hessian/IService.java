  
package com.jtunisie.osgi.hessian;

import com.jtunisie.osgi.hessian.exceptions.ServiceException;



/**
 *
 * @author Slim OUERTANI
 */
public interface IService {
    public String execute() throws ServiceException;
}
