public class Move extends Customer{
    String customerName;
    String previousState;
    public Move(String customerName, String previousState){
        super('C');
        this.customerName = customerName;
        this.previousState = previousState;
    }
    @Override
    public String getCustomerInfo(){
        return "Moved from "+previousState+". Ticket Number "+ getTicketNumber()+ ". Name: " +customerName;
    }
}
