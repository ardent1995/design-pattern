package builderpattern.practicaldemo;

public class BuilderPatternEx {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Md Tohosif","Ikbal")
                .age(24)
                .phone("8052025250")
                .address("Dummy Address")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Suguresh","H")
                .age(27)
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Pravat","Pandit")
                .phone("8731987877")
                .build();
        System.out.println(user3);
    }
}
