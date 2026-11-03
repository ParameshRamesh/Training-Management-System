import java.util.ArrayList;

public class TrainingManagement {

    ArrayList<TrainingProgram> programs = new ArrayList<>();
    ArrayList<Participant> participants = new ArrayList<>();

    public void addProgram(TrainingProgram program) {

        programs.add(program);

        System.out.println("Program added successfully!");
    }

    public void viewPrograms() {

        for (TrainingProgram p : programs) {
            p.displayProgram();
        }
    }

    public void registerParticipant(Participant participant) {

        boolean found = false;

        for (TrainingProgram p : programs) {

            if (p.programId == participant.programId) {
                found = true;
                break;
            }
        }

        if (found) {
            participants.add(participant);
            System.out.println("Participant registered successfully!");
        } else {
            System.out.println("Invalid Program ID!");
        }
    }

    public void viewParticipants() {

        for (Participant p : participants) {
            p.displayParticipant();
        }
    }

    public void searchParticipant(int id) {

        for (Participant p : participants) {

            if (p.participantId == id) {
                p.displayParticipant();
                return;
            }
        }

        System.out.println("Participant not found!");
    }

    public void markAttendance(int id) {

        for (Participant p : participants) {

            if (p.participantId == id) {

                p.attendance = true;

                System.out.println("Attendance marked successfully!");
                return;
            }
        }

        System.out.println("Participant not found!");
    }
}