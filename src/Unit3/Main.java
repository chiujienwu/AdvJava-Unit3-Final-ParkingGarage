package Unit3;

public class Main {

    public static void main(String[] args) {
        TicketFactory ticketFactory = new TicketFactory();

        PayTicket payTicket1 = ticketFactory.getTicket("lostticket");

        payTicket1.ticketPayment();
    }
}
