public class ChemistryStudent extends Student {
    private float infomaticsGrade;
    private float chemistryGrade;

    public ChemistryStudent(int studentId, String studentName, float infomaticsGrade, float chemistryGrade) {
        super(studentId, studentName);
        this.infomaticsGrade = infomaticsGrade;
        this.chemistryGrade = chemistryGrade;
    }

    public float getInfomaticsGrade() {
        return infomaticsGrade;
    }

    public void setInfomaticsGrade(float infomaticsGrade) {
        this.infomaticsGrade = infomaticsGrade;
    }

    public float getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(float chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public float getTotalGrade() {
        return infomaticsGrade + chemistryGrade;
    }

    @Override public float getAverageGrade() {
        return (infomaticsGrade + chemistryGrade) / 2;
    }

    @Override public void displayGrade() {
        System.out.println("Infomatics Grade: " + getInfomaticsGrade());
        System.out.println("Chemistry Grade: " + getChemistryGrade());
    }
}
