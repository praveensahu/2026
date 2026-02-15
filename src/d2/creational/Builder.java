package d2.creational;
class User{
    private String name;
    public User(UserBuilder u){
        name = u.name;
    }
    public static class UserBuilder{
        private  String name;

        public  UserBuilder setName(String n){
            name = n;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
public class Builder {

    public static void main(String[] args) {
        User u = new User.UserBuilder().setName("k").build();
        System.out.println(u);
    }
}
