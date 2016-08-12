/**
 * <p>@title:					co.jt.utils</p>
 * <p>@description:	Some common utilities or tools</p>
 * <p>@author:		JT Li</p>
 * <p>@date:			2016年8月12日 下午3:14:45</p>
 * <p>@version:		1.0</p>
 */
package co.jt.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @title:	GetClientIP
 * @description:	Get client ip address.
 * @author:	JT Li
 * @date:		2016年8月12日 下午3:14:45
 */
public class GetClientIP {

   /**				
    * @description: Get Client IP address. 
    * @param: 	 HttpServletRequest request
    */
   public String getClientIP(HttpServletRequest request) {
      if (request.getHeader("x-forwarded-for")==null){
         return request.getRemoteAddr();
      }
      return request.getHeader("x-forwarded-for");
   }

}
