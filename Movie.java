public class Movie {
    int id;
    String name;
    String showTime;

    public Movie(int id, String name, String showTime) {
        this.id = id;
        this.name = name;
        this.showTime = showTime;
    }

    public void display() {
        System.out.println(id + ". " + name + " at " + showTime);
    }
}
