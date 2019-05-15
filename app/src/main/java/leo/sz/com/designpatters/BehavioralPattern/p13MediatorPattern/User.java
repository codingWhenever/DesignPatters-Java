package leo.sz.com.designpatters.BehavioralPattern.p13MediatorPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
