package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private final ReportService RS;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        RS = new ConsoleOutput();
    }

    /**
     * @return course number 
     */
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            RS.addData("Error: courseNumber cannot be null of empty string");
            RS.outputReport();
            throw new IllegalArgumentException("Error: prerequisites cannot be null"
                    + " of empty string");
            
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

    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0){
            RS.addData("Error: prerequisites cannot be null of empty string");
            RS.outputReport();
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
            }
        this.prerequisites = prerequisites;
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
}
