package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class RepeatState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        System.out.println("请不要重复投票！");
    }
}
