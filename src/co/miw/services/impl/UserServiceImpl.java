/**
 * User Service implement class
 */
package co.miw.services.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import co.miw.daos.BaseDao;
import co.miw.daos.UserDao;
import co.miw.models.User;
import co.miw.services.UserService;

/**
 * @author JTLi; 16/06/14
 * User Service implement
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {
   @Resource(name="userDao")
   public void setUserDao(BaseDao<User,Integer> userDaoImpl){
      super.SetBaseDao(userDaoImpl);
   }
   /* (non-Javadoc)
    * @see co.miw.services.BaseService#create(java.lang.Object)
    */
   @Override
   public void create(User model) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryById(java.io.Serializable)
    */
   @Override
   public User queryById(Integer id) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryList()
    */
   @Override
   public List<User> queryList() {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#queryByPage(int, int)
    */
   @Override
   public List<User> queryByPage(int pageNo, int pageSize) {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#update(java.lang.Object)
    */
   @Override
   public void update(User model) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#deleteById(java.io.Serializable)
    */
   @Override
   public void deleteById(Integer id) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.services.BaseService#deleteObject(java.lang.Object)
    */
   @Override
   public void deleteObject(User model) {
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see co.miw.services.UserService#verifyUserPwd(co.miw.models.User, java.lang.String, java.lang.String)
    */
   @Override
   public boolean verifyUserPwd(User user, Integer uid, String password) {
      // TODO Auto-generated method stub
      return false;
   }

}
