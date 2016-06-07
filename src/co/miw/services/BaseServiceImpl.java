/**
 * Contains Services and base Service's implement abstract class.
 */
package co.miw.services;

import java.util.List;

/**
 * @author JTLi; 16/06/07
 * Basic CRUD transaction. Refer to the following mapping relationships between program and DB transaction(SQL):
 * insert - Create; select/query - Retrieve; update - Update; delete - Delete;
 */
public abstract class BaseServiceImpl<M, PK extends java.io.Serializable> implements BaseService<M, PK> {

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#create(java.lang.Object)
    */
   @Override
   public void create(M model) {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryById(java.io.Serializable)
    */
   @Override
   public M queryById(PK id) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryList()
    */
   @Override
   public List<M> queryList() {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryByPage(int, int)
    */
   @Override
   public List<M> queryByPage(int pageNo, int pageSize) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#update(java.lang.Object)
    */
   @Override
   public void update(M model) {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#deleteById(java.io.Serializable)
    */
   @Override
   public void deleteById(PK id) {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#deleteObject(java.lang.Object)
    */
   @Override
   public void deleteObject(M model) {
      // TODO Auto-generated method stub
      
   }
   
}
