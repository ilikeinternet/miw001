/**
 * Because using MyBatis3+ and Spring, choose the Injecting Mapper method to replace traditional DAO method.
 * Since this is equivalent to DAO, the naming method of methods use insert, select, update and delete which is SQL language.
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
   void insertUser(User user) throws Exception;
   //Insert selected users according to selected on the display/a list.
//   void insertSelectedUser(List<User> list);
   //Query a user by user id.
   User selectByKey(Integer uid);
//   //Query all users.
//   List<User> selectList();
//   //Updated user's information according to user id.
//   void updateByKey(User user);   //or  updateByKey(Integer id, User user);  //user contains id's infomation.
//   //Delete a user according to user id.
//   void deleteByKey(Integer id);
}
