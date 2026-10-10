package beyond;

public class ReservationSystem {
    // This value is shared by all person threads, so bookings must update it safely.
    private int availableSeats = 10;

    // synchronized locks this ReservationSystem object for the whole check-and-book operation.
    // Without the lock, two threads could both see the same seats as available and overbook.
    private synchronized void reserve(String person, int requestedSeats) {
        System.out.println(person + " entered.");
        System.out.println("Available seats: " + availableSeats
                + " Requested seats: " + requestedSeats);

        if (requestedSeats <= availableSeats) {
            System.out.println("Seat Available. Reserve now :-)");
            availableSeats -= requestedSeats;
            System.out.println(requestedSeats + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(person + " leaving.");
    }

    public static void main(String[] args) throws InterruptedException {
        ReservationSystem reservation = new ReservationSystem();

        // Each lambda is the task (Runnable) that a separate thread will execute.
        Thread person1 = new Thread(() -> reservation.reserve("Person-1", 5));
        Thread person2 = new Thread(() -> reservation.reserve("Person-2", 2));
        Thread person3 = new Thread(() -> reservation.reserve("Person-3", 4));

        // start() runs the task on a new thread; join() makes main wait for that thread to finish.
        // Joining in this order keeps the sample output predictable; synchronized still protects
        // the shared seat count if the threads are allowed to run at the same time.
        person1.start();
        person1.join();
        System.out.println("-");

        person2.start();
        person2.join();
        System.out.println("-");

        person3.start();
        person3.join();
    }
}
