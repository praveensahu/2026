package design_patterns.creational;

public class Builder {
    private String name;
    private int salary;
    public Builder(UserBuilder u){
        this.name = u.name;
        this.salary = u.salary;
    }

    public static class UserBuilder{
        private String name;
        private int salary;
        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }
        public UserBuilder setSalary(int salary){
            this.salary = salary;
            return this;
        }
        public  Builder build(){
            return new Builder(this);
        }
    }

    Builder b = new UserBuilder().setName("pra").setSalary(100).build();

}
