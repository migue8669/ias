package co.com.ias.learning.students.commons;

import static co.com.ias.learning.students.commons.StringUtils.nonBlank;

public class NonEmptyString {
    private final String value;
    public NonEmptyString(String value){
        Validate.notNull(value,"No puede ser nulo");
        Validate.isTrue(nonBlank(value),"no puede estar vacío");
        this.value=value;
    }
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "NonEmptyString{" +
                "value='" + value + '\'' +
                '}';
    }
}
