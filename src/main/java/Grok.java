
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (slbullock23)
 * @version (0.2)
 */
public class Grok {
    private static final int DEFAULT_POWER_LEVEL = 50; // static integer field DEFAULT_POWER_LEVEL , set to 50
    private int powerLevel; // integer field called powerLevel

    /**
     \* Initializes a Grok object to the default power level of 50.
     */
    public Grok()
    {
        this.powerLevel = DEFAULT_POWER_LEVEL;
    }
    /**
     *
     * Initializes a Grok object to power powerLevel
     */
    public Grok(int powerLevel)
    {
        this.powerLevel = powerLevel;
    }
    /*
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
    public int getPowerLevel()
    {
        return powerLevel; // returns the power level of this Grok
    }

    /*
     * Sets the power level of this Grok.
     * @param powerLevel the power value to set for this Grok.
     */
    public void setPowerLevel(int powerLevel) // sets the power level of this Grok.
    {
        this.powerLevel = powerLevel; // powerLevel the power value to set for this Grok.
    }

    /*
     * Set the power level of this Grok to the power level of the pill.
     * @param pill The PowerPill that is this Grok.  The power
     * of the pill is added to the power level of this Grok.
     */
    public void takePowerPill(PowerPill Pill)
    {
        this.powerLevel += Pill.getPower();
    }
    /*
     * Invoked when this Grok takes a hit.  The power level of
     * this Grok is reduced by 5.
     */
    public void tookHit() // invoked when this Grok takes a hit.
    {
        this.powerLevel -= 5; // the power level of this Grok is reduced by 5.
    }
}