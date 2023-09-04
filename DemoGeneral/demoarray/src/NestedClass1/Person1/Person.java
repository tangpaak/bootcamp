package Person1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='"
                + lastName + '\'' + ", age=" + age + ", address='" + address
                + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';

    }

    //////////////////////////////////////////////////////////////
    // Builder
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNumber;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // *** build() method to create Person
        public Person build() {
            return new Person(this);
        }
    }
    //////////////////////////////////////////////////////////////



    public static void main(String[] args) {
        Person person1 = new Person.Builder().firstName("John").lastName("Wick")
                .age(30).build();

        Person person2 =
                new Person.Builder().firstName("YUA").lastName("Mikami").age(25)
                        .address("33C").phoneNumber("555-1234").build();
        System.out.println(person1);
        System.out.println(person2);

        // Self- Test
        Person person3 = Person.builder().firstName("HULK MAN")
                .lastName("BANNER").build();
        System.out.println(person3);
    }
}


