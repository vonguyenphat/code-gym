package codegym.vn.appborrowbook.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleException{
    @ExceptionHandler({QuantityZero.class})
    public String handleQuantityZeroException(QuantityZero e, Model model) {
        model.addAttribute("message", e);
        return "exception";
    }
}
