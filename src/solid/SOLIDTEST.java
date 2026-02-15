package solid;
class FakeNotification implements  Notification{
    @Override
    public void sendNotification() {

    }
}
public class SOLIDTEST {

    public  void test() {
        NotificationService n = new NotificationService(new FakeNotification());
        n.notifyUsers();

        //assertTest();

    }
}
