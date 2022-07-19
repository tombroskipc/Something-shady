public abstract class Student {
    private int studentId;
    private String studentName;
    
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    abstract float getAverageGrade();
    
    public void display() {
        System.out.println("--- START STUDENT INFO ---");
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Total Grade: " + getTotalGrade());
        System.out.println("Average Grade: " + getAverageGrade());

        System.out.println("\nEach Subject: ");
        displayGrade();
        System.out.println("--- END STUDENT INFO --- \n");
    }

    abstract void displayGrade();

    abstract float getTotalGrade();
}