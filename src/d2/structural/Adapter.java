package d2.structural;
interface oldcharger{
    void charge();
}

class OldCharge{

    public void chargeOld() {
        System.out.println("old");
    }
}
class CHargerAdapter implements  oldcharger{
    OldCharge c;
    @Override
    public void charge() {
        c.chargeOld();
    }
}
public class Adapter {
}
