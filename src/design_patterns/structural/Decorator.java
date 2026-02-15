package design_patterns.structural;
interface Coffee{
    void makeCoffee();
    double getCost();
}

class BasicCoffee implements Coffee{
    public void makeCoffee(){
        System.out.println("Basic coffee");
    }
    public double getCost(){
        return 50;
    }
}

class Capuchino implements Coffee{

    private Coffee coffee;

    public Capuchino(Coffee coffee){
        this.coffee = coffee;
    }

    public void makeCoffee(){
        coffee.makeCoffee();
        System.out.println("Adding milk foam");
    }

    public double getCost(){
        return coffee.getCost() + 30;
    }
}

public class Decorator {

    public static void main(String[] args) {
        Coffee c = new Capuchino(new BasicCoffee());
        c.makeCoffee();
        System.out.println(c.getCost());
    }
}

