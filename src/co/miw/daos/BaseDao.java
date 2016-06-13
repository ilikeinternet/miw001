/**
 * Contains DAO interface and base DAO interface.
 */
package co.miw.daos;

import java.util.List;

/**
 * @author JTLi; 16/06/07
 * Basic DAO transaction. Refer to the following mapping relationships between program and DB transaction(SQL):
 * insert - Create; select/query - Retrieve; update - Update; delete - Delete;
 */
public interface BaseDao<M, PK extends java.io.Serializable> {
   //Insert a record
   public void insert(M model);
   //Find a record by id
   public M queryById(PK id);
   //Query data by page
   public List<M> queryByPage(String sql, int pageSize, int pgaeNo);
   //Get  the number of record set
   public int getCount(String sql);
   //Update
   public void update(M model);
   //Delete data by id
   public void deleteById(PK id);
   //Delete data the a object
   public void deleteObject(M model);
}
