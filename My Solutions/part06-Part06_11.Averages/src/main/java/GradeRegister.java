
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsStore;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsStore = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointsStore.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        double numOfGrade = 0.0;
        double gradeTotal = 0.0;
        for (int gradeCount : this.grades) {
            numOfGrade++;
            gradeTotal += gradeCount;
        }
        double avg = gradeTotal / numOfGrade;
        return avg;
    }

    public double averageOfPoints() {
        if (this.pointsStore.isEmpty()) {
            return -1;
        }
        double numOfPoints = 0.0;
        double pointTotal = 0.0;
        for (int points : this.pointsStore) {
            numOfPoints++;
            pointTotal += points;
        }
        double pointAvg = pointTotal / numOfPoints;
        return pointAvg;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
