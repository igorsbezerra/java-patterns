package patterns.builder;

public class Address {
    private String street;
    private String complement;

    protected Address() {
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    protected void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}
