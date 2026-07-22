package behaviolar.memento;

import java.util.Stack;

public class GameHistory {
    private Stack<StatisticState> history = new Stack<>();

    public void push(StatisticState state) { history.push(state); }
    public StatisticState pop() { return history.pop(); }
}
