/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package controller;

import beans.Complaint;
import beans.Users;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import function.UserDao;
import function.viewComplaintDao;
import java.util.List;

/**
 *
 * @author Talal Saleem
 */
public class SendtoEndorse implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView m = new ModelAndView("Endorse"); 
       return m;
      //  talal.name
        // return m;     //  tsls.
    }
    //return ModelAndView(new Redirect("index.htm"));
}
