package GannLevels;

public class StudentGrade {

    public static String checkStudentGrade(int grade) {
        if (grade >= 90) {
            return "Excellent";
        } else if (grade >= 75) {
            return "Very Good";
        } else if (grade >= 60) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }

}
