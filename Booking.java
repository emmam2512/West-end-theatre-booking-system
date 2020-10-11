package sample;

public class Booking {

    private String customerName;
    private int numberOfSeats;
    private String show;
    private String performance;
    private int date;

    public Booking(String customerName,int numberOfSeats,String show,String performance,int date){
        this.customerName =customerName;
        this.numberOfSeats =numberOfSeats;
        this.show =show;
        this.performance =performance;
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customerName='" + customerName + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", show='" + show + '\'' +
                ", performance='" + performance + '\'' +
                ", date=" + date +
                '}';
    }
}
