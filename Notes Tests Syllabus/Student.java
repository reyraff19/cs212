import java.util.*;

public class Student {
    // Student is the object, meaning I can create a variable name Student which has
    // the name and the absence count

    public SeatingChart(List<Student> studentList, int rows, int cols){
        int student = 0;
        seats = new Student[rows][cols];
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                seats[i][j] = studentList.get(student);
                if(student >= studentList.size()){
                break;
                }
                student++;
            }
        }
    }

    public int removeAbsentStudents(int allowedAbsences) {
        int absentStudents = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (seats[i][j] != null && studentList[i][j].getAbsenceCount() > allowedAbsences) {
                    studentList.get(Student).set(null);
                    absentStudents++;
                }
            }
        }
        return absentStudents;
    }
}
