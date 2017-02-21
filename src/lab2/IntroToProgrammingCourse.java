package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private final ReportService RS;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        RS = new ConsoleOutput();
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            RS.addData("Error: courseNumber cannot be null of empty string");
            RS.outputReport();
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            RS.addData("Error: credits must be in the range 0.5 to 4.0");
            RS.outputReport();
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    @Override
    public String getCourseName() {
        return courseName.toUpperCase();
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            RS.addData("Error: courseName cannot be null of empty string");
            RS.outputReport();
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        
    }
    
    public String getPrerequisites(String prerequisites) {
        return "NOT REQUIRED";
    }

    
}
