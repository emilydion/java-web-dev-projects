public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public String getName() {return name; }
        public int getStudentId() { return studentId; }
        public int getNumberOfCredits() { return numberOfCredits; }
        public double getGpa() { return gpa; }

        public void setName(String newName) { name = newName; }
        public void setStudentId(int newStudentId) { studentId = newStudentId; }
        public void setNumberOfCredits(int newNumberOfCredits) { numberOfCredits = newNumberOfCredits; }
        public void setGpa(double newGpa) { gpa = newGpa; }


}
