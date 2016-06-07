/**
 * Contains Services and base services interface.
 */
package co.miw.services;

import java.util.List;

/**
 * @author JTLi; 16/06/07
 * Basic service. Refer to the following mapping relationships between program and DB transaction(SQL):
 * insert - Create; select/query - Retrieve; update - Update; delete - Delete;
 */
public interface BaseService<M, PK extends java.io.Serializable> {
   //Create or add a input record
   public void create(M model);
   //A common method of getting a record, according to a input id.
   public M queryById(PK id);
   //A method of getting a recordset, which is a collection.
   public List<M> queryList();
   //A method of getting a recordset, which is a collection by page.
   public List<M> queryByPage(int pageNo, int pageSize);
   //Update
   public void update(M model);
   //Delete a record by id
   public void deleteById(PK id);
   //Delete a object
   public void deleteObject(M model);
}
