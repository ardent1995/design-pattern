package builderpattern.practicaldemo;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder{
        private final String firstName;//final because mandatory field and need to initialize in constructor
        private final String lastName; //final because mandatory field and need to initialize in constructor
        private int age = -1; //optional
        private String phone; //optional
        private String address; //optional

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        //Return the finally constructed User object
        public User build(){
            User user = new User(this);
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user){
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
