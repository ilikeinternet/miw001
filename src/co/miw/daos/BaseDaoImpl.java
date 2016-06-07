/**
 * Contains DAO and base DAO's implement abstract class.
 */
package co.miw.daos;

import java.util.List;

/**
 * @author JTLi; 16/06/07
 * Basic DAO transaction. Refer to the following mapping relationships between program and DB transaction(SQL):
 * insert - Create; select/query - Retrieve; update - Update; delete - Delete;
 */
public abstract class BaseDaoImpl<M, PK extends java.io.Serializable> implements BaseDao<M, PK> {

   public BaseDaoImpl() {
      // Get the generic actual superclass's type
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#insert(java.lang.Object)
    */
   @Override
   public void insert(M model) {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#queryById(java.io.Serializable)
    */
   @Override
   public M queryById(PK id) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#queryByPage(java.lang.String, int, int)
    */
   @Override
   public List<M> queryByPage(String sql, int pageSize, int pgaeNo) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#getCount(java.lang.String)
    */
   @Override
   public int getCount(String sql) {
      // TODO Auto-generated method stub
      return 0;
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#update(java.lang.Object)
    */
   @Override
   public void update(M model) {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#deleteById(java.io.Serializable)
    */
   @Override
   public void deleteById(PK id) {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#deleteObject(java.lang.Object)
    */
   @Override
   public void deleteObject(M model) {
      // TODO Auto-generated method stub
      
   }

}
