package Unit3;

//Strategy Pattern for various types of machines used in the garage that have various functions (behaviors)

import Unit2.CheckOut;

abstract class TicketMachine {

    //this behavior vary with ticket or special event
    CheckInBehavior checkInBehavior;
    //this behaviors vary with ticket or lost ticket
    CheckOutBehavior checkOutBehavior;


    public TicketMachine (CheckInBehavior checkInBehavior, CheckOutBehavior checkOutBehavior)
    {
        this.checkInBehavior = checkInBehavior;
        this.checkOutBehavior = checkOutBehavior;
    }

    //delegate checkInBehavior
    public void checkIn ()
    {
        checkInBehavior.checkIn();
    }

    //delegate checkOutBehavior
    public void checkOut ()
    {
        checkOutBehavior.checkOut();
    }

    public void setCheckInBehavior(CheckInBehavior checkInBehavior)
    {
        this.checkInBehavior = checkInBehavior;
    }

    public void setCheckInBehavior(CheckOutBehavior checkOutBehavior)
    {
        this.checkOutBehavior = checkOutBehavior;
    }

}
