package codegym.vn.appborrowbook.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Logger;
@Aspect
@Component
public class AddRentAOP {
    private Logger logger = Logger.getLogger(AddRentAOP.class.getName());

    // advice chính là phương thức writeLogPersonBookBorrowerServiceCreate(), loại advice là AfterReturning
    // point cut => "execution(*  codegym.vn.appborrowbook.service.iml.PersonBookBorrowerService.*(..))"
    // từ cái execution trên => join point là các phương thức trong class PersonBookBorrowerService => có 7 join point
    // point cut cách để xác định 7 join point
    @AfterReturning("execution(* codegym.vn.appborrowbook.service.iml.PersonBookBorrowerService.*(..))")
    public void writeLogPersonBookBorrowerServiceCreate(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("AfterReturning: person borrower service End call " + methodName );
    }
    @AfterReturning("execution(* codegym.vn.appborrowbook.service.iml.BookService.*(..))")
    public void writeLogBookService(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("AfterReturning: book service End call " + methodName );
    }
    @AfterReturning("execution(* codegym.vn.appborrowbook.controller.PersonController.*(..))")
    public void returnRentList(JoinPoint point) {
        String methodName = point.getSignature().getName();
        logger.info("Controller " + methodName + LocalDateTime.now());
    }
}
