package org.example;

public class Address {
    private String H_no;
    private String city;
    private String State;

   /* public Address(String h_no, String city, String state) {
        H_no = h_no;
        this.city = city;
        State = state;
    }*/

    public String getH_no() {
        return H_no;
    }

    public void setH_no(String h_no) {
        H_no = h_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "H_no='" + H_no + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
