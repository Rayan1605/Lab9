public class PreferredCustomer extends Customer{

    int customerpurchase;
    double discount;

    public PreferredCustomer(){

    }
    public PreferredCustomer(String name , String address , String phonenumber , String customernumber, boolean mailinglist , int customerpurchase){
       super( name ,  address ,  phonenumber ,  customernumber, mailinglist);
        this.customerpurchase = customerpurchase;

    }

    public int getCustomerpurchase() {
        return customerpurchase;
    }

    public void setCustomerpurchase(int customerpurchase) {
        this.customerpurchase = customerpurchase;
    }

    public double getDiscount() {

    if ((discount == 0) && (getCustomerpurchase() >= 500)){
             return setDiscount(getCustomerpurchase());
        }
    else{
            return discount;
        }
    }
        public double setDiscount( int  customerpurchase){
                if (customerpurchase < 500) {
                    return 0;
                } else if (customerpurchase >= 500 && customerpurchase < 1000) {
                    return 0.05;
                } else if (customerpurchase >= 1000 && customerpurchase < 1500) {
                    return 0.06;
                } else if (customerpurchase >= 1500 && customerpurchase < 2000) {
                    return 0.07;
                } else {
                    return 0.1;
                }
        }
    }

