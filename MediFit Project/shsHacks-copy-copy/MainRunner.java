import java.util.Scanner;
/**
 * Write a description of class MainRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainRunner
{
    public static void main (String [] args)
    {
        plan1 p = new plan1();
        plan2 f = new plan2();
        plan3 g = new plan3();
        plan4 l = new plan4();

        System.out.println("Welcome to the Part C health insurance calculator, where you will be able to find a plan best suited for your needs! In order to ensure that your plan is the best fit for you, we would ask that you answer a few questions./n");
          
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        Scanner q1 = new Scanner(System.in);
        System.out.println("What is your budget for a monthly premium?\n A)$0-$25 \n B)$25-$40 \n C)$40-$65\n D)$65-$80" );
        String input = q1.nextLine();
        if(input.equals("A"))
        {
            counter1+=1;
            counter2+=1;
            counter3+=1;
            counter4+=1;
        }
        else if(input.equals("B"))
        {
            counter1+=1;
            counter2+=1;
            counter4+=1;
        }
        else if(input.equals("C"))
        {
            counter1+=1;
            counter2+=1;
            counter4+=1;
        } 
        else 
        {
            counter4+=1;
        }

        Scanner q2 = new Scanner(System.in);
        System.out.println("What is your budget for yearly diagnostics?\n A)$0-$85 \n B)$85-$110 \n C)$110-$135" );
        String input1 = q1.nextLine();
        if(input.equals("A"))
        {
            counter1+=1;
            counter2+=1;
            counter3+=1;
            counter4+=1;
        }
        else if(input.equals("B"))
        {
            counter1+=1;
            counter2+=1;
            counter3+=1;
        }
        else 
        {
            counter3+=1;
        }
      
        Scanner q3 = new Scanner(System.in);
        System.out.println("Which benefits would you like the best?\n ");
        System.out.print("A) ");
        p.setbenefits();
        for(int x=0; x<p.getLength(); x++)
        {
            System.out.print(p.getBenefits(x));
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("B) ");
        f.setbenefits();
        for(int x=0; x<f.getLength(); x++)
        {
            System.out.print(f.getBenefits(x));
            System.out.print(" ");
        }
        
        System.out.println();
        System.out.print("C)");
        g.setbenefits();
        for(int x=0; x<g.getLength(); x++)
        {
            System.out.print(g.getBenefits(x));
            System.out.print(" ");
        }
        
        System.out.println();
        System.out.print("D) ");
        l.setbenefits();
        for(int x=0; x<l.getLength(); x++)
        {
            System.out.print(l.getBenefits(x));
            System.out.print(" ");
        }
        String input2 = q1.nextLine();
        if(input.equals("A"))
        {
            counter1+=1;
        }
        else if(input.equals("B"))
        {
            counter2+=1;
        }
        else if(input.equals("C"))
        {
            counter3+=1;
        }
        else 
        {
            counter4+=1;
        }
        Scanner q4 = new Scanner(System.in);
        System.out.println("\nWhat is your budget for specialist costs?\n A)$0-$30 \n B)$30-$40 \n C)$40-$45" );
        String input3 = q1.nextLine();
        if(input.equals("A"))
        {
            counter1+=1;
            counter2+=1;
            counter3+=1;
            counter4+=1;
        }
        else if(input.equals("B"))
        {
            counter1+=1;
            counter2+=1;
            counter3+=1;
        }
        else 
        {
            counter2+=1;

        }
        p.setName();
        f.setName();
        g.setName();
        l.setName();
        if((counter1>counter2) && (counter1>counter3) && (counter1>counter4))
        {
            System.out.println("Based upon your results, the " + p.getName() + " seems the best plan for you." + "\nPlease note that before enrolling in a plan, you should consult an offical healthcare agent.");
        }
        if((counter2>counter1) && (counter2>counter3) && (counter2>counter4))
        {
            System.out.println("Based upon your results, the " + f.getName() + " seems the best plan for you." + "\nPlease note that before enrolling in a plan, you should consult an offical healthcare agent.");
        }
        if((counter3>counter2) && (counter3>counter1) && (counter3>counter4))
        {
            System.out.println("Based upon your results, the " + g.getName() + " seems the best plan for you." + "\nPlease note that before enrolling in a plan, you should consult an offical healthcare agent.");
        }
        if((counter4>counter2) && (counter4>counter3) && (counter4>counter1))
        {
            System.out.println("Based upon your results, the " + l.getName() + " seems the best plan for you." + "\nPlease note that before enrolling in a plan, you should consult an offical healthcare agent.");
        }
    }
}
