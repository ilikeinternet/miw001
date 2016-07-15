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
	//Insert a user.
   void insertUser(User user);
   //Insert selected users according to selected on the display/a list.
//   void insertSelectedUser(List<User> list);
//   //Query a user by user id.
//   User selectByKey(Integer id);
//   //Query all users.
//   List<User> selectList();
//   //Updated user's information according to user id.
//   void updateByKey(User user);   //or  updateByKey(Integer id, User user);  //user contains id's infomation.
//   //Delete a user according to user id.
//   void deleteByKey(Integer id);
}
