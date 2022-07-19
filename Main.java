public class Main {

    public static void main (String args[]) {
        Student student1 = new ChemistryStudent(1, "John", 8, 7);
        student1.display();
        Student student2 = new BiologyStudent(2, "Jane", 10, 10);
        student2.display();
    }
}
