public class Person {

    String name;
    String address;
    String Phonenumber;

    public Person() {

    }

    public Person(String name , String address , String Phonenumber){
        this.name = name;
        this.address = address;
        this.Phonenumber = Phonenumber;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
