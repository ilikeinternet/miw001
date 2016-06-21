/**
 * MIW System web controller
 */
package co.wim.web.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import co.miw.models.User;
import co.miw.services.UserService;

/**
 * @author JTLi; 16/06/01
 * System login controller
 */
@Controller
@SessionAttributes("loginUser")
public class LoginController {
   private UserService userService;
   @Resource
   public void setUserService(UserService userService){
      this.userService=userService;
   }
   @RequestMapping(value="/login",method=RequestMethod.POST)
   public ModelAndView login(String uid,String password,HttpSession session){
      ModelAndView view=null;
      //To transfer the user info, divide the getting user info and verification into 2 steps
      User user=userService.queryById(uid);
      System.out.println(user);
      //Input uid is not existing, then return the login page with ERROR message.
      if (user==null){
         view=new ModelAndView(new RedirectView("login.jsp"));
         session.setAttribute("errorMsg", "No this User!!!");
         return view;
      }
      if (userService.verifyUserPwd(user, uid, password)){
         session.setAttribute("user", user);
         view=new ModelAndView("success");
         return view;
      }
      view=new ModelAndView("error");
      return view;
   }
   @RequestMapping("/logout")
   public String logout(Model model,HttpSession session){
      model.asMap().remove("loginUser");
      session.invalidate();
      return "redirect:/login.jsp";
   }
}
