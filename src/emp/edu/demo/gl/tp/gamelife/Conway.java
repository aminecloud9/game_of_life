package emp.edu.demo.gl.tp.gamelife;

/**
 * RuleSet implementing Conway's Game of Life.
 *
 * @author TAKI_Dj
 */
public class Conway implements RuleSet {

    @Override
    public String getName() {
        return "Conway's Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    @Override
    public boolean applyRules(boolean isAlive, int neighborCount) {
        /*
        if (isAlive && neighborCount == 2) {
            return true;
        } else if (isAlive && neighborCount == 3) {
            return true;
        } else if (!isAlive && neighborCount == 3) {
            return true;
        }
        return false;
        */

        if (isAlive) {
            return (neighborCount == 2 || neighborCount == 3) ;
        } else {
            return (neighborCount == 3);
        }

        /*
        if (isAlive && neighborCount < 2) {
            return false;
        } else if (isAlive && (neighborCount == 2 || neighborCount == 3)) {
            return true;
        } else if (isAlive && neighborCount > 3) {
            return false;
        } else if (!isAlive && neighborCount == 3) {
            return true;
        } else {
            return isAlive;
        }
        */
    }
}