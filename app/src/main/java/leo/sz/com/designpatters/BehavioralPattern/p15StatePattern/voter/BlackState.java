package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class BlackState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
