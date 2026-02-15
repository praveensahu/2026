package design_patterns.structural;
 class OldCharger {
     public void chargeWithRoundPin(){
         System.out.println("old pin");
     }
}

interface  Charger{
     void charge();
}

class ChargerAdapter implements  Charger{
     private OldCharger old;
     public  ChargerAdapter(OldCharger old){
         this.old = old;
     }

    @Override
    public void charge() {
        old.chargeWithRoundPin();
    }
}
public class Adapter{
    public static void main(String[] args) {
        Charger c = new ChargerAdapter(new OldCharger());
        c.charge();
    }
}