package strategy;

import java.util.List;

public class ValidatorContext {
    List<IValidator> validatorList;

    public ValidatorContext(List<IValidator> validatorList) {
        this.validatorList = validatorList;
    }

    public boolean isValid() {
        for (IValidator validator : validatorList) {
            if (!validator.isValid()) {
                return false;
            }
        }
        return true;
    }
}
