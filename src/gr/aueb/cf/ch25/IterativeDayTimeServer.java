package gr.aueb.cf.ch25;

public class IterativeDayTimeServer {

    public static void main(String[] args) {
        DateTimeServer dateTimeServer = new DateTimeServer();
        dateTimeServer.start();
        System.out.println("DateTime Server has started...");
    }
}
