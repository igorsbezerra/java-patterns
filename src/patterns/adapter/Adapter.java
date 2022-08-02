package patterns.adapter;

import java.util.Objects;

public class Adapter {

    public static void main(String[] args) {
        var joao = new PhysicalPerson("000.000.000-00");
        var empresa = new LegalPerson("11.111.111/0001-11");

        var personProcessor = new PersonProcessor();
        personProcessor.process(empresa);
        personProcessor.process(joao);
    }

    public static class PersonProcessor {
        void process(PersonAdapter adapter) {
            if (Objects.isNull(adapter.getRegister())) {
                System.out.println("Registro não informado");
            }
        }
    }
}
