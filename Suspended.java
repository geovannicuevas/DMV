public class Suspended extends Customer {
    String customerName = "";
    String violation = "";

    public Suspended(String Name, String vio) {
        super('D');
        Name = customerName;
        vio = violation;
    }

    @Override
    public String getCustomerInfo() {
        return "Violation: " + violation + ". Ticket Number " + getTicketNumber() + ". Name: " + customerName;
    }
}