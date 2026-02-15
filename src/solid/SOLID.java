package solid;
interface Notification{
    void sendNotification();
}

class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("asd");
    }
}

class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("asd");
    }
}

class NotificationService{
    private Notification n;
    public NotificationService(Notification n){
        this.n = n;
    }
    public void notifyUsers(){
        n.notify();;
    }
}
public class SOLID {

    public static void main(String[] args) {
        EmailNotification e = new EmailNotification();
        NotificationService n = new NotificationService(e);
        n.notifyUsers();
    }
}


