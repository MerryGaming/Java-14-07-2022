import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static until.UntilScaner.SCANNER;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();
    private String ANSWER_ENTER_IS_NO = "no";
    private static StudentManagement studentManagementInstance = new StudentManagement();

    public static StudentManagement getStudentManagementInstance() {
        return studentManagementInstance;
    }

    private StudentManagement() {

    }
    public void enterStudent() {
        System.out.printf("Nhap danh sach sinh vien: \n");
        boolean checkAnswer = true;
        do {
            var student = new Student();
            student.setStudent();
            students.add(student);

            System.out.printf("Ban co muon nhap lai khong?? (Nhap 'no' de ket thuc!!): ");
            String answer = SCANNER.nextLine();
            if(answer.equalsIgnoreCase(ANSWER_ENTER_IS_NO)) {
                checkAnswer = false;
            } else {
                System.out.println("---------------------------------------------");
            }

        } while (checkAnswer);
        System.out.println("=============================================");

    }

    public void printStudent()
    {
        System.out.printf("\n\nDanh sach sinh vien da nhap la:");
        System.out.println(students);
    }





}
