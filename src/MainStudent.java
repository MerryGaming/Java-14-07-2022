public class MainStudent {
    public static void main(String[] args) {
        var studentManagement = StudentManagement.getStudentManagementInstance();

        studentManagement.enterStudent();
        studentManagement.printStudent();
        studentManagement.search();
    }
}
