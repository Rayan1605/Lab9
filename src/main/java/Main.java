
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
      System.out.println("LAB 9");
      Scanner myinput = new Scanner(System.in);

      Customer customer1 = new Customer("Harry", "tuam ","0891234567","321",true);
        System.out.println("Customer 1 ");

        System.out.println("Name : " + customer1.name + " | Address: "
                + customer1.address + " | Number : "
                + customer1.Phonenumber + " | CustomerNumber: "
                + customer1.getCustomernumber() + " | MailingList: "
                + customer1.mailinglist);

      System.out.println();


      System.out.println();
        Customer customer2 = new Customer();
      System.out.println("Please type your name");
        customer2.setName(myinput.next());
      System.out.println("Please type your address");
        customer2.setAddress(myinput.next());
      System.out.println("Please type your Phone-number");
        customer2.setPhonenumber(myinput.next());
      System.out.println("Please type your CustomerNumber");
        customer2.setCustomernumber(myinput.next());
        customer2.setMailinglist(true);
        System.out.println();

        System.out.println("Customer 2 ");


        System.out.println("Name : " + customer2.getName() + " | Address: "
                + customer2.getAddress() + " | Number : "
                + customer2.getPhonenumber() + " | CustomerNumber: "
                + customer2.getCustomernumber() + " | MailingList: "
                + customer2.isMailinglist());

      System.out.println("LAB 10");

      PreferredCustomer preferredCustomer1 = new PreferredCustomer("Atreus" , "Norway" , "08973330222245", "12",false,20000);
      System.out.println("Name : " + preferredCustomer1.getName() + " | Address: "
              + preferredCustomer1.getAddress() + " | Number : "
              + preferredCustomer1.getPhonenumber() + " | CustomerNumber: "
              + preferredCustomer1.getCustomernumber() + " | MailingList: "
              + preferredCustomer1.isMailinglist() +  " |  Purchase "
              +preferredCustomer1.getCustomerpurchase() + " |  Discount (in decimals)"
              +preferredCustomer1.getDiscount());

      System.out.println();


      PreferredCustomer preferredCustomer2 = new PreferredCustomer();
      preferredCustomer2.setName("Drake");
      preferredCustomer2.setAddress("Florida");
      preferredCustomer2.setPhonenumber("01234556");
      preferredCustomer2.setMailinglist(true);
      preferredCustomer2.setCustomernumber("321");
      preferredCustomer2.setCustomerpurchase(200);
      preferredCustomer2.setDiscount(preferredCustomer1.getCustomerpurchase());

      System.out.println("Name : " + preferredCustomer2.getName() + " | Address: "
              + preferredCustomer2.getAddress() + " | Number : "
              + preferredCustomer2.getPhonenumber() + " | CustomerNumber: "
              + preferredCustomer2.getCustomernumber() + " | MailingList: "
              + preferredCustomer2.isMailinglist() + " | Purchase "
              +preferredCustomer2.getCustomerpurchase() + " | Discount (in decimals) "
              +preferredCustomer2.getDiscount());







    }
}
