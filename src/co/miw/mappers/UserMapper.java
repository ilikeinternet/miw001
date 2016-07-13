/**
 * Because using MyBatis3+ and Spring, choose the Injecting Mapper method to replace traditional DAO method.
 */
package co.miw.mappers;

import java.util.List;
import co.miw.models.User;

/**
 * @author JTLi
 * Refer to the following mapping relationships between program and DB transaction(SQL):
 * insert - Create; select/query - Retrieve; update - Update; delete - Delete;
 */
public interface UserMapper {
   void insertUser(User user);
   void insertSelectedUser(List<User> list);
   User selectByKey(Integer id);
   List<User> selectList();
   void updateByKey(User user);   //or  updateByKey(Integer id, User user);  //user contains id's infomation.
   void deleteByKey(Integer id);
}
