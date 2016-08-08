/**
 * <p>@title:					co.jt.utils.DateConverter</p>
 * <p>@description:	Stores some utilities or common tools.</p>
 * <p>@author:		JT Li</p>
 * <p>@date:			2016年8月5日 下午1:45:47</p>
 * <p>@version:		1.0</p>
 */
package co.jt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

/**
 * @title:	DateConverter
 * @description:	Date converter
 * @author:	JT Li
 * @date:		2016年8月5日 下午1:45:47
 */
public class DateConverter implements Converter<String,Date> {
   @Override
   public Date convert(String source) {
      // Convert the date type string to Date, which pattern is "yyyy-MM-dd"
      SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
      try {
         return simpleDateFormat.parse(source);
      } catch (ParseException e) {
         e.printStackTrace();
      } 
      return null;
   }
   

}
