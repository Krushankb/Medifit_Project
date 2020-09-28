
/**
 * Write a description of class plan4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class plan4
{
    private String name;
    private int premium;
    private int diagnostics;
    private String [] benefits = new String[4];
    private boolean overCounter;
    private boolean dental;
    private boolean eyeCare;
    private int specialistCost;
    public plan4()
    {
        
    }
    public void setName()
    {
        name = "AARP Medicare Advantage Plan 2(HMO)";
    }
    public String getName()
    {
        return name;
    }
    public void setPremium()
    {
        premium = 76;
    }
    public int getPremium()
    {
        return premium;
    }
    public void setDiagnostics()
    {
        diagnostics = 110;
    }
    public int getDiagnostics()
    {
        return diagnostics;
    }
    public void setbenefits()
    {
        benefits[0] = "Ambulatory Surgical Center($0-$225 copay)";
        benefits[1] = " Outpatient Hospital Services($0-$275 copay)";
        benefits[2] = " Annual Out of Pocket Maximum($3,900 copay)";
        benefits[3] = " Diagnostic Radiology Services($0-$85 copay)";
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
        specialistCost = 30;
    }
    public int getSpecialistCost()
    {
        return specialistCost;
    }
}
