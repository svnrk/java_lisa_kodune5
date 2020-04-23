public class Vendor {
    private String nameOfCompany;
    private String address;
    private String nameOfRepresentative;
    private String phoneNumber;

    public Vendor(String nameOfCompany, String address, String nameOfRepresentative, String phoneNumber) {
        this.nameOfCompany = nameOfCompany;
        this.address = address;
        this.nameOfRepresentative = nameOfRepresentative;
        this.phoneNumber = phoneNumber;
    }

    public Vendor(String nameOfCompany, String address) {
        this.nameOfCompany = nameOfCompany;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", address='" + address + '\'' +
                ", nameOfRepresentative='" + nameOfRepresentative + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameOfRepresentative() {
        return nameOfRepresentative;
    }

    public void setNameOfRepresentative(String nameOfRepresentative) {
        this.nameOfRepresentative = nameOfRepresentative;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
