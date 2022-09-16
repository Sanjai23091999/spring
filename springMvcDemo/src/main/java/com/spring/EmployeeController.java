package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
    public class EmployeeController {
        @Autowired
        private Dao dao;

        @RequestMapping(value="/")
        public ModelAndView listContact(ModelAndView model) throws IOException {
            List<Employee> employees = dao.list();
            model.addObject("listContact", employees);
            model.setViewName("home");

            return model;
        }

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public ModelAndView newEmployee(ModelAndView model) {
        Employee employee = new Employee();
        model.addObject( employee);
        model.setViewName("View");
        return model;
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute ("employee")Employee employee) {
        dao.saveOrUpdate(employee);
        return new ModelAndView("View","Employee", new Employee());
    }

    @RequestMapping(value = "/editContact", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee  employee = dao.get(id);
        ModelAndView model = new ModelAndView("ContactForm");
        model.addObject("contact", employee);

        return model;
    }


}
