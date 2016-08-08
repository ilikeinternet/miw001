/**
 * 
 */
package co.miw.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.miw.mappers.FquotationMapper;
import co.miw.models.Fquotation;
import co.miw.services.FquotationService;

/**
 * @author JTLi
 * Futures quotation implement. It stores all futures transactions.
 */
@Service("fquotationServiceImpl")
public class FquotationServiceImpl extends BaseServiceImpl<Fquotation, String> implements FquotationService {
   @Autowired
   private FquotationMapper fquotationMapper;
   /**
    * @see co.miw.services.BaseService#create(java.lang.Object)
    * Create the daily quotations of futures' contracts.
    */
   @Override
   public void create(Fquotation fquotation) {
      try {
         fquotationMapper.insertFquotation(fquotation);
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryById(java.lang.Object)
    */
   @Override
   public Fquotation queryById(String id) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryList()
    */
   @Override
   public List<Fquotation> queryList() {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryByPage(int, int)
    */
   @Override
   public List<Fquotation> queryByPage(int pageNo, int pageSize) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#update(java.lang.Object)
    */
   @Override
   public void update(Fquotation model) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#deleteById(java.lang.Object)
    */
   @Override
   public void deleteById(String id) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#deleteObject(java.lang.Object)
    */
   @Override
   public void deleteObject(Fquotation model) {
      // TODO Auto-generated method stub

   }

}
