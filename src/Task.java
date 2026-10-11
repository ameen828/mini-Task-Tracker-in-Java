abstract public class Task {
    private final int id;
    private String title;
    private int priority;
    private boolean done;

    static int nextId=0;

    public Task(String title){
        this(title, 3);
    }

    public Task(String title, int priority){
        this.title=title;
        if (priority >= 1 & priority <= 5){
            this.priority=priority;
        }
        this.id=++nextId;
    }

    void complete(){}

    abstract int urgencyScore();

    public boolean isDone() {
        return done;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public int getId() {
        return id;
    }
}
