package school.management.system;

/*This class is responsible for keeping track of the students fees, id, name, grade and paid fees.*/

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * This is a constructor, and it is used to initialize a new student.
     * @param id unique student id
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student (int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //Student's name and ID can't be changed

    /**
     * used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return returns the students ID.
     */
    public int getId() {
        return id;
    }

    /**
     * @return returns the students NAME.
     */
    public String getName() {
        return name;
    }

    /**
     * @return returns the students GRADE.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */
    public int getRemainingFees () {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return  "\n------Student Info------\n" +
                "Student's name: " + name + "\n" +
                "Total fees paid so far: $" + feesPaid;
    }

}
