import java.util.*;
public class task1{
    public static float grade(float maths, float phy, float chem, float phyedu, float eng){
        float cally = ((maths + phy + chem + phyedu + eng)/5);
        if(cally >= 95 && cally <= 100){
            System.out.println("Congratulations You have Qualified the Examination and you are in top 5%");
            System.out.println("Grade :- A+");
        }
        else if(cally < 95  && cally >= 85){
            System.out.println("Nice performance you have qualify the examination !!");
            System.out.println("Grade :- A");
        }
        else if(cally < 85 && cally >= 80){
            System.out.println("Better !! Good Prerformance, You have passed the examination");
            System.out.println("Grade :- B+");
        }
        else if (cally < 80 && cally >= 75){
            System.out.println("Good Try !! You have passed the examination");
            System.out.println("Grade :- B");
        }
        else if (cally < 75 && cally >= 65){
            System.out.println("Hard work required !! You have passed the examination");
            System.out.println("Grade :- C");
        }
        else if(cally < 65 && cally >= 50){
            System.out.println("You just passed the examination");
            System.out.println("Grade :- D");
        }
        else{
            System.out.println("OOPS !! You disqualified the examination");
            System.out.println("Grade :- E");
        }
        return cally;
        
    }
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Calculator for calculating the average percentage of Candidate");

        System.out.println("Enter the obtained number of MATHEMATICS out of 100 :- ");
        float maths = sn.nextFloat();

        System.out.println("Enter the obtained number of PHYSICS out of 100 :- ");
        float phy = sn.nextFloat();

        System.out.println("Enter the obtained number of CHEMISTRY out of 100 :- ");
        float chem = sn.nextFloat();

        System.out.println("Enter the obtained number of PHYSICAL EDUCATION out of 100 :- ");
        float phyedu = sn.nextFloat();

        System.out.println("Enter the obtained number of ENGLISH out of 100 :- ");
        float eng = sn.nextFloat();

        marks_calculator markscal1 = new marks_calculator();
        System.out.println("Total marks obtained by the candidate are as follow :- " + markscal1.sum(maths, phy, chem, phyedu, eng));

        average_percentage avr1 = new average_percentage();
        float percent_obtained = avr1.percent(maths, phy, chem, phyedu, eng);
        System.out.println(percent_obtained);

        float grade_calculation = grade(maths,phy,chem,phyedu,eng);
        
    }
}
class marks_calculator{
    float sum(float maths, float phy, float chem, float phyedu, float eng){
        return (maths + phy + chem + phyedu + eng);
    }
}
class average_percentage {
    float percent(float maths, float phy, float chem, float phyedu, float eng){
        System.out.println("Aversge Percentage obtained by the Candidate is as follow :- ");
        return ((maths + phy + chem + phyedu + eng)/5);
    }
}

// DSTL
// Concept of OBJECT ORIENTED PROIGRAMING
// Function
// Conditional Statement 