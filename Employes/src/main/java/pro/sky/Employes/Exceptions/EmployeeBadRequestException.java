package pro.sky.Employes.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmployeeBadRequestException extends RuntimeException {
    public EmployeeBadRequestException(String message) {
        super(message);
    }
}
