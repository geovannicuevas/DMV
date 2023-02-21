public class NewTest extends Customer{
    String customerName = "";
    String DOB = "";
    public NewTest(String name, String date){
        super('A');
        customerName = name;
        DOB = date;

    }

    @Override
    public String getCustomerInfo(){
        return "New Drivers License. Ticket Number "+ getTicketNumber()+ ". Name: " +customerName+" DOB: "+DOB;
    }



}
