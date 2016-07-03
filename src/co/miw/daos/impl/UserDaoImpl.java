/**
 *  Contains DAO and base DAO's implement abstract class.
 */
package co.miw.daos.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import co.miw.daos.UserDao;
import co.miw.models.User;

/**
 * @author JTLi; 16/06/27
 * User data accessing.
 */
@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements UserDao {

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#insert(java.lang.Object)
    */
   @Override
   public void insert(User model) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#queryById(java.lang.Object)
    */
   @Override
   public User queryById(Integer id) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#queryByPage(java.lang.String, int, int)
    */
   @Override
   public List<User> queryByPage(String sql, int pageSize, int pgaeNo) {
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
   public void update(User model) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#deleteById(java.lang.Object)
    */
   @Override
   public void deleteById(Integer id) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.daos.BaseDao#deleteObject(java.lang.Object)
    */
   @Override
   public void deleteObject(User model) {
      // TODO Auto-generated method stub

   }

}
