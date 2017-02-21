package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
//    private String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;
    private final ReportService RS;

    public IntroJavaCourse(String courseName, String courseNumber) {
        RS = new ConsoleOutput();
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);  
    }

    @Override
    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        super.setCourseNumber(courseNumber);
    }

    @Override
    public double getCredits() {
        return super.getCredits();
    }


    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
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
        super.setCourseName(courseName);
    }

}
