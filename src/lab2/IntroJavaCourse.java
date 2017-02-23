package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            throw new IllegalArgumentException("Error: credits must be in the "
                    + "range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String getCourseName() {
        return this.courseName.toUpperCase();
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
}
