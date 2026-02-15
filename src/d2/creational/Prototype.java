package d2.creational;
interface  prot{
    prot p();
}

class real implements  prot{
    private String name;
    public real(String name){
        this.name = name;
    }
    public real(real t){
        this.name =t.name;
    }

    @Override
    public prot p() {
        return new real(this);
    }
}
public class Prototype {
    public static void main(String[] args) {
        real r = new real("asd");
        r.p();
    }
}
