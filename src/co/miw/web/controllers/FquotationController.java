package co.miw.web.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import co.miw.models.Fquotation;
import co.miw.services.FquotationService;

@Controller
@RequestMapping("/futures")
public class FquotationController {
   private FquotationService fquotationServiceImpl;
   //Enter the creation page.
   @RequestMapping(value="/create",method=RequestMethod.GET)
   public ModelAndView create(HttpSession httpSession) {
      ModelAndView mav=new ModelAndView();
      //User user=(User)httpSession.getAttribute("user");
      mav.setViewName("fquotationcreate");
      return mav;
   }
   @RequestMapping(value="/create",method=RequestMethod.POST)
   public ModelAndView create(HttpSession httpSession, Fquotation fquotation) {
      ModelAndView mav=new ModelAndView();
      fquotationServiceImpl.create(fquotation);
      //User user=(User)httpSession.getAttribute("user");
      mav.setViewName("main");
      return mav;
   }
}
