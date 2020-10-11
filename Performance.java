package sample;

public class Performance {

    private int time;
    private String Date;
    public Performance next;



    public Performance(int time,String Date)
    {
        this.time = time;
        this.Date = Date;
        next = null;

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Performance =" +
                "Time:" + time +
                ", Date=" + Date +
                '}';
    }
}
