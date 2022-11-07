package school.management.system;

/**
 * this class is responsible for keeping track
 * of the teacher's id, name and salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary teacher's salary.
     */
    public Teacher(int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     * @return returns the id for the current teacher
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return returns the name for the current teacher
     */
    public String getName () {
        return this.name;
    }

    /**
     * @return returns the salary for the current teacher
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * Sets the salary.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary=salary;
    }

    /**
     * Adds to the salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return  "\n------Teacher Info------\n" +
                "Teacher's name: " + name + "\n" +
                "Total salary earned so far: $" + salaryEarned;
    }
}
