public class BookingThread extends Thread {
    int movieId;
    String customerName;

    public BookingThread(int movieId, String customerName) {
        this.movieId = movieId;
        this.customerName = customerName;
    }

    public void run() {
        Booking.bookTicket(movieId, customerName);
    }
}
