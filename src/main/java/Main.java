public class Main {
    public static void main(String[] args) {
      Customer customer1 = new Customer("David","tuam ","0891234567","321",true);
        System.out.println("Customer 1 ");

        System.out.println("Name : " + customer1.name + " | Address: "
                + customer1.address + " | Number : "
                + customer1.Phonenumber + " | CustomerNumber: "
                + customer1 + " | MailingList: "
                + customer1.mailinglist);

        Customer customer2 = new Customer();
        customer2.setName("Myron");
        customer2.setAddress("Las veges");
        customer2.setPhonenumber("80912345678");
        customer2.setCustomernumber("1905");
        customer2.setMailinglist(true);
        System.out.println();

        System.out.println("Customer 2 ");


        System.out.println("Name : " + customer2.getName() + " | Address: "
                + customer2.getAddress() + " | Number : "
                + customer2.getPhonenumber() + " | CustomerNumber: "
                + customer2.getCustomernumber() + " | MailingList: "
                + customer2.isMailinglist());

    }
}
