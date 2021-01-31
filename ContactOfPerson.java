public class ContactOfPerson {


    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNo;


    public ContactOfPerson(String firstName, String lastName, String address, String city, String state, String zip,
                           String phoneNo) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

 @Override
    public String toString() {
        String addressString = "Name: " + firstName + " " + lastName +
                "\nPhone: " + phoneNo +
                "\nAddress: " + address + ", " + city + ", " + state +
                "\nZIP: " + zip;
        return addressString;
    }

    public static void main(String[] args) {
        ContactOfPerson c=new ContactOfPerson("Biswajit","Dixit","sector","rourkela","odisha","282288228","63736025");
        System.out.println(c);
    }
}
