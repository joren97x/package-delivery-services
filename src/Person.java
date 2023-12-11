public class Person {

    private String name;
    private String address;
    private String city;
    private String state;
    private String ZIP_code;

    public Person(String name, String address, String city, String state, String ZIP_code) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.state = state;
        this.ZIP_code = ZIP_code;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZIP_code() {
        return this.ZIP_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZIP_code(String ZIP_code) {
        this.ZIP_code = ZIP_code;
    }

}
