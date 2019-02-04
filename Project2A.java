import javax.swing.JOptionPane;

public class Project2A
{
   public static void main(String[] args)
      {
         double sqftbrm = 20.0;
         double sqftdrm = 40.0;
         double sqfthal = 5.0;
         double sqftgrm = 60.0;
         double sqftstr = 30.0;
      
         double bf = .15;
         double df = .10;
         double hf = .20;
         double gf = 0.25;
         double sf = .30;
      
          System.out.println("bedroom: " + sqftbrm + " square feet");
          System.out.println("dining room: " + sqftdrm + " square feet"); 
          System.out.println("hall: " + sqfthal + " square feet");
          System.out.println("great room: " + sqftgrm + " square feet");
          System.out.println("stairs: " + sqftstr + " square feet");
          
          double stndCst = ((sqftbrm + sqftdrm +sqfthal + sqftgrm + sqftstr) / 5.0)*20.00;
          System.out.println(stndCst);
       
          double wtAvg = (sqftbrm*bf + sqftdrm*df + sqfthal*hf + sqftgrm*gf + sqftstr*sf)*20.00;
          System.out.println(wtAvg);
          
          JOptionPane.showMessageDialog(null,"Standard Carpet Cost: " + stndCst + "\nWeighted Carpet Cost: " + wtAvg);

      }
}