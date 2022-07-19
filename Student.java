public abstract class Student {
    private float studentId;
    private String studentName;
    
    public Student(float studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public float getStudentId() {
        return studentId;
    }

    public void setStudentId(float studentId) {
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
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Total Grade: " + getTotalGrade());
        System.out.println("Average Grade: " + getAverageGrade());

        displayGrade();
    }

    abstract void displayGrade();

    abstract float getTotalGrade();
}