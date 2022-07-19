public class BiologyStudent extends Student {
    private float infomaticsGrade;
    private float biologyGrade;

    public BiologyStudent(int studentId, String studentName, float infomaticsGrade, float biologyGrade) {
        super(studentId, studentName);
        this.infomaticsGrade = infomaticsGrade;
        this.biologyGrade = biologyGrade;
    }

    public float getInfomaticsGrade() {
        return infomaticsGrade;
    }

    public void setInfomaticsGrade(float infomaticsGrade) {
        this.infomaticsGrade = infomaticsGrade;
    }

    public float getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(float biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    @Override public float getAverageGrade() {
        return (infomaticsGrade + biologyGrade) / 2;
    }

    @Override public float getTotalGrade() {
        return infomaticsGrade + biologyGrade;
    }

    @Override public void displayGrade() {
        System.out.println("Infomatics Grade: " + getInfomaticsGrade());
        System.out.println("Biology Grade: " + getBiologyGrade());
    }
}
