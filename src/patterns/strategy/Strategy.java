package patterns.strategy;

public class Strategy {

    public static void main(String[] args) {
        Person person = new Person("12345678910", 19);
        validatePerson(person, new PhysicalPersonValidator());
        validatePerson(person, new LegalPersonValidator());
        validatePerson(person, new Greather18years());
    }

    public static void validatePerson(Person person, IValidator validator) {
        validator.validate(person);
    }

    interface IValidator {
        void validate(Person person);
    }

    private static class PhysicalPersonValidator implements IValidator {
        @Override
        public void validate(Person person) {
            if (person.getRegistry().length() > 11) {
                throw new IllegalArgumentException("Problema com CPF!");
            }
        }
    }

    private static class LegalPersonValidator implements IValidator {
        @Override
        public void validate(Person person) {
            if (person.getRegistry().length() < 14) {
                throw new IllegalArgumentException("Problema com o CNPJ");
            }
        }
    }

    private static class Greather18years implements IValidator {
        @Override
        public void validate(Person person) {
            if (person.getAge() <= 18) {
                throw new IllegalArgumentException("É menor ou igual a 18 anos");
            }
        }
    }
}
