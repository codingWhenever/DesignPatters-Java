package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class SpiteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        String str = manager.getMapVote().get(user);
        if (str != null) {
            manager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }
}
