package patterns.strategy;

public class Person {

    private String registry;
    private Integer age;

    public Person(String registry, Integer age) {
        this.registry = registry;
        this.age = age;
    }

    public String getRegistry() {
        return registry;
    }

    public Integer getAge() {
        return age;
    }
}
