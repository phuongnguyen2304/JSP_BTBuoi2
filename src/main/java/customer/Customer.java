package customer;

public class Customer {
    private String name;
    private String birthDate;
    private String address;
    private String photoURL;

    public Customer(String name, String birthDate, String address, String photoURL){
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.photoURL = photoURL;
    }
    public String getName(){
        return name;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getAddress(){
        return address;
    }
    public String getPhotoURL() {
        return photoURL;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhotoURL(String photoURL){
        this.photoURL = photoURL;
    }
}
