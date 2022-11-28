

    public class Customer extends Person {
        String customernumber;
        boolean mailinglist;

        public Customer(){

        }

        public Customer(String name , String address , String phonenumber , String customernumber, boolean mailinglist){

            super(name,address,phonenumber);
           this.customernumber = customernumber;
           this.mailinglist = mailinglist;
        }

        public String getCustomernumber() {
            return customernumber;
        }

        public void setCustomernumber(String customernumber) {
            this.customernumber = customernumber;
        }

        public boolean isMailinglist() {
            return mailinglist;
        }

        public void setMailinglist(boolean mailinglist) {
            this.mailinglist = mailinglist;
        }

}
