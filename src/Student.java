public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, int averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;

    }

    public int getScholarship(){
        if(averageMark == 5){
            return 100;
        }else return 80;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void main(String[] args){
        Student[] students = new Student[]{new Student("Temut", "Koszhanov", "SE-2334", 5),
                new Student("Erasyl", "Sanatylla", "SE-2334", 4),
                new Aspirant("Tamerlan", "Sagyngali", "HE-2334", 5, "Blockchain")
        };

        for(Student student: students){
            System.out.println(student.getFirstName() + "'s scholarship amount is " + student.getScholarship());
        }

        Student era = new Aspirant("Erasyl", "Marat", "EE-2301", 4, "BlockChain");
        System.out.println(era.getFirstName() + "'s scholarship amount is " + era.getScholarship());

    }
}

class Aspirant extends Student{
    String scientificWorks;
    public Aspirant(String firstName, String lastName, String group, int averageMark, String scientificWorks){
        super(firstName, lastName, group, averageMark);
        this.scientificWorks = scientificWorks;
    }

    @Override
    public int getScholarship(){
        if(averageMark == 5){
            return 200;
        }
        return 180;
    }
}

/*Inheritance Student, Postgraduate
⦁	Create an inheritance example, implement a Student class and an Aspirant class, a graduate student differs from a student by having some scientific work.
⦁	The Student class contains variables: String firstName, lastName, group. Also, double averageMark containing the average mark.
⦁	Create a variable of type Student that refers to an object of type Aspirant.
⦁	Create a getScholarship() method for the Student class that returns the scholarship amount. If the average student grade is 5, then the amount is $100, otherwise 80. Override this method in the Aspirant class. If the average postgraduate grade is 5, then the amount is $200, otherwise 180.
⦁	Create an array of type Student containing objects of class Student and Aspirant. Call the getScholarship() method for each array element.
*/