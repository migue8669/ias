package co.com.ias.learning.students.domain;

import co.com.ias.learning.students.commons.StringUtils;
import co.com.ias.learning.students.commons.Validate;

import java.util.Objects;
import java.util.regex.Pattern;

public class IdentificationNumber {
    private final String value;
    private final Pattern pattern = Pattern.compile("^\\d{8,20}$");

    public IdentificationNumber(String value){


            Validate.notNull(value,"no puede ser null");
            Validate.isTrue(StringUtils.nonBlank(value),"no vacio");
        Validate.isTrue(pattern.matcher(value).matches(), "Invalid identification number: " + value);
        this.value = value;
        }
        public String getValue(){
        return value;
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IdentificationNumber that = (IdentificationNumber) obj;
        return Objects.equals(value, that.value);    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "IdentificationNumber{" +
                "value='" + value + '\'' +
                '}';
    }
}

