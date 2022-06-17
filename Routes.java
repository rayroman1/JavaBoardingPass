package javaboardingproject;

public class Routes {
    int routeid;

    String from;
    String to;
    String departuretime;
    String arrivaltime;
    float price;
    public Routes() {
        this.routeid = routeid;
        this.from = from;
        this.to = to;
        this.departuretime = departuretime;
        this.arrivaltime = arrivaltime;
        this.price = price;
    }
    public Routes(int routeid, String from, String to, String departuretime, String arrivaltime, float price) {
        this.routeid = routeid;
        this.from = from;
        this.to = to;
        this.departuretime = departuretime;
        this.arrivaltime = arrivaltime;
        this.price = price;
    }

    public int getRouteid() {
        return routeid;
    }

    public void setRouteid(int routeid) {
        this.routeid = routeid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "routeid=" + routeid +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departuretime='" + departuretime + '\'' +
                ", arrivaltime='" + arrivaltime + '\'' +
                ", price=" + price +
                '}';
    }
}
