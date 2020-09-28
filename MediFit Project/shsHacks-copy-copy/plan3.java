
/**
 * Write a description of class plan3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class plan3
{
    
    private String name;
    private int premium;
    private int diagnostics;
    private String [] benefits = new String [4];
    private boolean overCounter;
    private boolean dental;
    private boolean eyeCare;
    private int specialistCost;
    public plan3()
    {
        
    }
    public void setName()
    {
        name = "AARP Medicare Advantage Access(HMO)";
    }
    public String getName()
    {
        return name;
    }
    public void setPremium()
    {
        premium = 0;
    }
    public int getPremium()
    {
        return premium;
    }
    public void setDiagnostics()
    {
        diagnostics = 135;
    }
    public int getDiagnostics()
    {
        return diagnostics;
    }
    public void setbenefits()
    {
        benefits[0] = " Ambulatory Surgical Center($0-$250 copay)";
        benefits[1] = " Outpatient Hospital Services($0-$250 copay)";
        benefits[2] = " Annual Out of Pocket Maximum($3,600 copay)";
        benefits[3] = " Diagnostic Radiology Services($0-$135 copay)";
    }
    public int getLength()
    {
        return benefits.length;
    }
    public String getBenefits(int x)
    {
        return benefits[x];
    }
    public boolean getoverCounter()
    {
        return false;
    }
    public void setSpecialistCost()
    {
        specialistCost = 40;
    }
    public int getSpecialistCost()
    {
        return specialistCost;
    }
}


