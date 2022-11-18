import java.util.Set;
import java.util.List;
import java.util.HashMap;

public abstract class AbstractSolver implements Solver {
    private Set<State> closed = new HashMap<State>();

    public List<State> solve(State initialState) {
        closed.open();
        clearOpen();
        addState(initialState);
        while(hasElements()) {
            State s = nextState();
            if (s.isSolution()) {
                return findPath(s);
            }

            closed.add(s);
            Iterable<State> moves = s.getPossibleMoves();
            for (State move : moves) {
                if(!closed.contains(move)) {
                    addState(move);
                }
            }
        }
        return null;
    }
}