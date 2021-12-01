/*Java Doc


FILE PATH 

   G:\Coding\Projects Java\Recursion

CREATOR

   Joseph Cahoon Jr.
   

START END DATE

   12/1/2021 - 12/1/2021

PROGRAM

   Continuous interest + added cash per month solver

INPUTS

   startCash - put the amount of money started with
   
   add - how much added per month
   
   interest - interest rate : 
                            100% = 1.0
                            50%  = 0.5
                            25%  = 0.25
                            10%  = 0.1
                             5%  = 0.05
                             1%  = 0.01
                           .55%  = 0.0055
                           
   time - time past per added(add) money, if you want months: IF YOU MESS WITH THIS THE MONTHS AND YEARS WILL NO BE ACCURATELY TOLD
                        1 MONTH  = 1.0/12.0 
                                 = 0.08333 
                       6 MONTHS  = 6.0/12.0
                         1 YEAR  = 12.0/12.0
                         
   limit - How much money you want
   
DONT MESS WITH
   sum - sum of everything you request from the program
   
   e - e constant in math
   
   x - months counter
   
*/

public class Interest {

   
   private static double startCash; //Cash you start with
   private static double add; //cash you add per month
   
   private static double interest; //interest 
   private static double time; //time in years
   private static double interval; //How many times per year the interest acummulates
   
   private static int limit; //limit for how much money you want
 
 
   private static double sum; //total of all the time and intrest and added cash
   private static double e; //e constant
   private static int x; //months
   public static void main(String[] args) { //Main
   /*
   main runs the statment + the continuous 
   interest method(reccursive) */
   
      //setting up variables
      setStartCash(1800);
      setTime();
      setInterest(0.05);
      setAdd(0);
      //setInterval();
      setLimit(1000000);
      setSum();
      setX();
      setE();
   
      System.out.println(interest);
      System.out.println("$" + continuous(startCash, 0) + " dollars");
      System.out.println(x / 12.0 + " years");
      
   }
   
   public static double continuous(double previousSum, int months) { //Recurrsive Continuous Interest
   /*
   Reccursive method uses continuous interest formula
   and my own addition to the equation to allow for the addition of 
   money throughout the months and years.
   */
   
      double rt = interest * time;
      double parenthesisRT = Math.pow(e, rt);
      System.out.println("rt " + rt);
      System.out.println("Interest " + interest);
      System.out.println("Prev" + " $" + previousSum);
      sum = (add + previousSum) * parenthesisRT;
      //System.out.println(add + previousSum);
      System.out.println("$" + sum);
      System.out.println("month " + x);
      System.out.println(" ");
      x += 1;
      if (sum <= limit) {
         return continuous(sum, months);
      }
      else {
         x -= 1;
         System.out.println("In " + x + " months you'll have ");
         return sum;
      }         
   }
   
   
   //GS startCash
   public static void setStartCash() {
      startCash = 1800;
   }
   public static void setStartCash(double set) {
      startCash = set;
   }
   public static double getStartCash() {
      return startCash;
   }

   
   //GS add
   public static void setAdd() {
      add = 650 * 2;
   }
   public static void setAdd(double set) {
      add = set;
   }
   public static double getAdd() {
      return add;
   }

   
   //GS interest
   public static void setInterest() {
      interest = .05;
   }
   public static void setInterest(double set) {
      interest = set;
   }
   public static double getInterest() {
      return interest;
   }
   
   //GS time
   public static void setTime() {
      time = .08333;
   }
   public static void setTime(double set) {
      time = set;
   }
   public static double getTime() {
      return time;
   }
   
   //GS interval
   public static void setInterval() {
      interval = 2;
   }
   public static void setInterval(double set) {
      interval = set;
   }
   public static double getInterval() {
      return interval;
   }
   
   //GS limit
   public static void setLimit() {
      limit = 1000000;
   }
   public static void setLimit(int set) {
      limit = set;
   }
   public static int getLimit() {
      return limit;
   }
   
   //GS sum
   public static void setSum() {
      sum = 0;
   }
   public static void setSum(double set) {
      sum = set;
   }
   public static double getSum() {
      return sum;
   }
   
   //GS e
   public static void setE() {
      e = 2.718281828459045;
   }
   public static void setE(double set) {
      e = set;
   }
   public static double getE() {
      return e;
   }
   
   //GS x
   public static void setX() {
      x = 1;
   }
   public static void setX(int set) {
      x = set;
   }
   public static int getX() {
      return x;   
   }
   

}