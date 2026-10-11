public class BugTask extends Task {
    private String saverity;

    public BugTask(String name){
        super(name);
    }

    public int urgencyScore(){
        return 10;
    }
}
