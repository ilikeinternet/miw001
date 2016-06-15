/**
 * User's transaction
 */
package co.miw.services;

import co.miw.models.User;

/**
 * @author JTLi; 16/06/14
 * User's transaction
 */
public interface UserService extends BaseService<User, String> {
   //If there are some special methods, it should be defined here
   //The user is true, then return the user's profile
   public boolean verifyUserPwd(User user, String uid, String password);
}
