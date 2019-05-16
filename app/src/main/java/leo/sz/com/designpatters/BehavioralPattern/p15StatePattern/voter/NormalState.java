package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class NormalState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        manager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功！！！");
    }
}
