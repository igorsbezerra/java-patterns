package patterns.builder;

public class MainBuilder {
    public static void main(String[] args) {

        var address = AddressBuilder.builder()
                .street("R. X")
                .complement("Complement Y")
                .build();

        System.out.println(address);
    }
}
