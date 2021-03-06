package org.example

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends AbstractCommandController {

    public UserController() {
        setCommandClass(UserCommand.class);
    }

    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, BindException e) throws Exception {
        UserCommand command = (UserCommand) o;
        String name = command.getName();
        int age = command.getAge();

        if (age > 18)
            return new ModelAndView("Welcome", "Name", name);
        else
            return new ModelAndView("Error", "Name", name);
    }
}
