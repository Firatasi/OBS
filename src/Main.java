public class Main {
    public static void main(String[] args) {

        Course math = new Course("Matematik", "MAT101","MAT");
        Course phy = new Course("Fizik", "FZK101","FZK");
        Course chem = new Course("Kimya", "KMY101", "KMY");

        Teacher teacherOne = new Teacher("Aziz", "+05", "MAT");
        Teacher teacherTwo = new Teacher("İsmail", "+05", "FZK");
        Teacher teacherThree = new Teacher("Sancar", "+05", "KMY");

        math.addTeacher(teacherOne);
        phy.addTeacher(teacherTwo);
        chem.addTeacher(teacherThree);

        Student studentOne = new Student("Fırat", "530", 4, math, phy, chem);
        studentOne.addNote(90, 70, 100);
        studentOne.isPass();

        Student studentTwo = new Student("Samet", "630", 4, math, phy, chem);
        studentOne.addNote(55, 70, 70);
        studentTwo.isPass();


        Student studentThree = new Student("Boran", "560", 4, math, phy, chem);
        studentOne.addNote(45, 100, 100);
        studentThree.isPass();

        Student studentFour = new Student("Orhan", "328", 4, math, phy, chem);
        studentFour.addNote(45, 10, 30);
        studentFour.isPass();

    }



}