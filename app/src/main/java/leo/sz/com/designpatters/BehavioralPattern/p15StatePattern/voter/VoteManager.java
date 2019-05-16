package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern.voter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class VoteManager {
    private VoteState state = null;
    private Map<String, String> mapVote = new HashMap<>();
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount += 1;
        mapVoteCount.put(user, oldVoteCount);
        if (oldVoteCount == 1) {
            state = new NormalState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SpiteState();
        } else if (oldVoteCount > 8) {
            state = new BlackState();
        }
        state.vote(user, voteItem, this);
    }
}
