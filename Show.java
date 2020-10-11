package sample;

public class Show {
    private String showName;
    private int runningTime;
    private String startDate;
    private String endDate;

    public Show next;
    public Performance head;

    public Show(String showName,int runningTime,String startDate,String endDate)
    {
        this.showName = showName;
        this.runningTime = runningTime;
        this.startDate = startDate;
        this.endDate = endDate;
       // this.priceTicket = priceTicket;
        next = null;
        head = null;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

  /*public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }
*/
    public void addPerformance(Performance newPerformance){
        newPerformance.next = head;
        head = newPerformance;
    }
    public Performance findPerformance(int index){
        Performance temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    @Override
    public String toString() {
        return "" +
                "Name of Show='" + showName + '\'' +
                ", Running Time of show =" + runningTime +
                ", Begins=" + startDate +
                ", Ends=" + endDate +
                "";
    }


}
