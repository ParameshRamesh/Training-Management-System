import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TrainingManagement tm = new TrainingManagement();

        int choice;

        do {

            System.out.println("\n===== TRAINING MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Training Program");
            System.out.println("2. View Training Programs");
            System.out.println("3. Register Participant");
            System.out.println("4. View Participants");
            System.out.println("5. Search Participant");
            System.out.println("6. Mark Attendance");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Program ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Program Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Trainer Name: ");
                    String trainer = sc.nextLine();

                    System.out.print("Enter Duration: ");
                    int duration = sc.nextInt();

                    tm.addProgram(
                        new TrainingProgram(pid, pname, trainer, duration)
                    );

                    break;

                case 2:

                    tm.viewPrograms();
                    break;

                case 3:

                    System.out.print("Enter Participant ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Participant Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Program ID: ");
                    int programId = sc.nextInt();

                    tm.registerParticipant(
                        new Participant(id, name, email, programId)
                    );

                    break;

                case 4:

                    tm.viewParticipants();
                    break;

                case 5:

                    System.out.print("Enter Participant ID: ");
                    int searchId = sc.nextInt();

                    tm.searchParticipant(searchId);
                    break;

                case 6:

                    System.out.print("Enter Participant ID: ");
                    int attendanceId = sc.nextInt();

                    tm.markAttendance(attendanceId);
                    break;

                case 7:

                    System.out.println("Thank you!");
                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}