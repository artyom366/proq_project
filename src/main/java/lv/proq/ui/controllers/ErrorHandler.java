package lv.proq.ui.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(MySQLIntegrityConstraintViolationException.class)
    public String handleDataBaseConstraintViolation(MySQLIntegrityConstraintViolationException e, Model model) {

        return "error";
    }
}
