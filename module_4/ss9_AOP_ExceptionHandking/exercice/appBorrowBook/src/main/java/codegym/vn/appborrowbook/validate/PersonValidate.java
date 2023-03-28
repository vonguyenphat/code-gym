package codegym.vn.appborrowbook.validate;

import codegym.vn.appborrowbook.model.PersonBookBorrower;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }
    @Override
    public void validate(Object target, Errors errors) {
        PersonBookBorrower personBookBorrower = (PersonBookBorrower) target;
        if (personBookBorrower.getBorrowedDate().getDate() > personBookBorrower.getPayDay().getDate()) {
            errors.rejectValue("borrowedDate", "DateValidate", null, "Ngay muong khong duoc lon hon ngay tra sach");
        }

    }
}
