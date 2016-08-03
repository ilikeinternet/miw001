/**
 * User's transaction
 */
package co.miw.services;

import co.miw.models.User;

/**
 * @author JTLi; 16/06/14
 * User's transaction. If there are some special methods, it should be defined here.
 */
public interface UserService extends BaseService<User, Integer> {
   //The user is true, then return the user's profile
   public boolean verifyUserPwd(User user, Integer uid, String password);
}
