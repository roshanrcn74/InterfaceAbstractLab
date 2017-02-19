package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
//    private String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;
    private final ReportService RS;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        RS = new ConsoleOutput();
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);    
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


   
    @Override
    public String getPrerequisites() {
        return this.prerequisites;
    }

   
    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            this.RS.addData("Error: prerequisites cannot be null"
                    + " of empty string");
            throw new IllegalArgumentException("Error: prerequisites cannot be null"
                    + " of empty string");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            this.RS.addData("Error: credits must be in the range 0.5 to 4.0");
            throw new IllegalArgumentException("Error: credits must be in the "
                    + "range 0.5 to 4.0");
        }
        super.setCredits(credits);
    }

    @Override
    public double getCredits() {
        return super.getCredits();
    }

    @Override
    public String getCourseName() {
        return super.getCourseName();
    }

    @Override
    public void setCourseName(String courseName) {
        super.setCourseName(courseName);
    }

    @Override
    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        super.setCourseNumber(courseNumber);
    }
    
}
