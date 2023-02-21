public class Renew extends Customer {
    String customerName;
    public Renew(String Name){
        super('B');
        customerName = Name;
    }
    @Override
    public String getCustomerInfo(){
        return "Renewal License. Ticket Number "+ getTicketNumber()+ ". Name: " +customerName;
}
}
