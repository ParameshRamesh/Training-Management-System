public class TrainingProgram {

    int programId;
    String programName;
    String trainer;
    int duration;

    public TrainingProgram(int programId,
                           String programName,
                           String trainer,
                           int duration) {

        this.programId = programId;
        this.programName = programName;
        this.trainer = trainer;
        this.duration = duration;
    }

    public void displayProgram() {

        System.out.println("Program ID: " + programId);
        System.out.println("Program Name: " + programName);
        System.out.println("Trainer: " + trainer);
        System.out.println("Duration: " + duration + " days");

    }
}