package Unit3;

public class TicketFactory {

    public PayTicket getTicket(String ticketType)
    {
        if(ticketType == null) {
            return null;
        }

        if (ticketType.equalsIgnoreCase(("specialevent")))
        {
            return new SpecialEvent();
        } else if (ticketType.equalsIgnoreCase(("haveticket")))
        {
            return new SpecialEvent();
        } else if (ticketType.equalsIgnoreCase(("lostticket")))
        {
            return new LostTicket();
        }
        return null;
    }
}
