public class Student {

    String name, studentNo;
    int classes;
    Course math;
    Course phy;
    Course chem;
    double avarage;
    boolean isPass;

    Student(String name, String studentNo, int classes, Course math, Course phy, Course chem) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
        calcAvarage();
        this.isPass = false;
    }


    public void addNote(int math, int phy, int chem) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (phy >= 0 && phy <= 100) {
            this.phy.note = phy;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.note = chem;
        }
    }

    public void calcAvarage() {

        this.avarage = (this.chem.note + this.phy.note + this.math.note) / 3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage >= 50;
    }

    public void printNote() {
        System.out.println("//**////**////**////**////**////**////**////**////**//");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.math.note);
        System.out.println("Fizik Notu: " + this.phy.note);
        System.out.println("Kimya Notu: " + this.chem.note);

    }

    public void isPass() {
        if(this.math.note == 0 || this.phy.note == 0 || this.chem.note == 0) {
            System.out.println("Not girişi bulunmamaktadır! ");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti! ");
            }else {
                System.out.println("Sınıfta kaldı! ");
            }
        }
    }

}
