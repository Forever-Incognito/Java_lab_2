package Task3;

public class Subject extends Marks{
private String subject;

    public Subject(String name, int mark, String subject) {
        super(name, mark);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
