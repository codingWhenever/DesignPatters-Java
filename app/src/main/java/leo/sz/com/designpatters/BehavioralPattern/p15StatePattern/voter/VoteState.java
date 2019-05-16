package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public interface VoteState {
    public void vote(String user, String voteItem, VoteManager manager);
}
