
    public abstract class Customer {
        private char ticketLetter;
        private int ticketNum;
        private static char aNextLetter = 1,bNextLetter=1,cNextLetter=1,dNextLetter=1;

        public Customer() {
            ticketLetter = 'X';
            ticketNum = 0;
        }
        public Customer(char ticketLetter) {
            if (ticketLetter == 'A') {
                this.ticketLetter = 'A';
                this.ticketNum = aNextLetter++;
            } else if (ticketLetter == 'B') {
                this.ticketLetter = 'B';
                this.ticketNum = bNextLetter++;
            } else if (ticketLetter == 'C') {
                this.ticketLetter = 'C';
                this.ticketNum = cNextLetter++;
            } else if (ticketLetter == 'D') {
                this.ticketLetter = 'D';
                this.ticketNum = dNextLetter++;
            }
            else
            {
                ticketLetter = 'X';
                ticketNum = 0;
                System.out.print("Error, letter must be A, B, C or D");

            }

        }
        protected String getTicketNumber() {
            return String.valueOf(ticketLetter) + String.valueOf(ticketNum);
        }
        public abstract String getCustomerInfo();

    }
