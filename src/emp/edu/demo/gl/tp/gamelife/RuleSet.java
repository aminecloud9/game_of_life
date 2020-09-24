package emp.edu.demo.gl.tp.gamelife;

/**
 * This interface defines the interface between the Life engine and the set of
 * rules describing the automata.
 * 
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 * 
 */
public interface RuleSet {
    public String getName();
    public boolean applyRules(boolean value, int neighborCount);
}