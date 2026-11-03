public class Participant {

    int participantId;
    String participantName;
    String email;
    int programId;
    boolean attendance;

    public Participant(int participantId,
                       String participantName,
                       String email,
                       int programId) {

        this.participantId = participantId;
        this.participantName = participantName;
        this.email = email;
        this.programId = programId;
        this.attendance = false;
    }

    public void displayParticipant() {

        System.out.println("Participant ID: " + participantId);
        System.out.println("Name: " + participantName);
        System.out.println("Email: " + email);
        System.out.println("Program ID: " + programId);
        System.out.println("Attendance: " +
                (attendance ? "Present" : "Not Marked"));
    }
}