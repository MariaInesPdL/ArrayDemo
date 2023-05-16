package arraydemo;

public class studentList {
    public static void main (String[] args){
    
        Student s1 = new Student("s1", "Maria");
        Student[] studentList = new Student[3];
        
        studentList[0] = s1;
        studentList[1] = new Student("s2","abc");
        studentList[2] = new Student("s3", "def");
        
        for (Student studentList1 : studentList) {
            System.out.println(studentList1.getStudentName());
        }
    }
}

