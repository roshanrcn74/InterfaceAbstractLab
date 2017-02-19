package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse{

    private final ReportService RS;
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        RS = new ConsoleOutput();
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);   
    }
    /**
     *
     * @return 
     */
    @Override
    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            this.RS.addData("Error: courseNumber cannot be "
                    + "null of empty string");
            throw new IllegalArgumentException("Error: courseNumber cannot be"
                    + " null of empty string");
        }
        super.setCourseNumber(courseNumber);
    }

    @Override
    public double getCredits() {
        return super.getCredits();
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            this.RS.addData("Error: credits must be in the "
                    + "range 0.5 to 4.0");
            throw new IllegalArgumentException("Error: credits must be in the "
                    + "range 0.5 to 4.0");
        }
        super.setCredits(credits);
    }

    @Override
    public String getCourseName() {
        return super.getCourseName();
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            this.RS.addData("Error: courseName cannot be "
                    + "null of empty string");
            throw new IllegalArgumentException("Error: courseName cannot be"
                    + " null of empty string");
        }
        super.setCourseName(courseName);
    }   

    @Override
    public String getPrerequisites() {
        return "NO PREREQUISITES";
    }

    @Override
    public void setPrerequisites(String prerequisites) {
       
    }
}
