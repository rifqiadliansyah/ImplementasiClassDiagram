
package maintest;




public class MainTest {

  
    public static void main(String[] args) {
      Employee [] e = new Employee[2];
      SalariedEmployee a = new SalariedEmployee();
      HourlyEmployee b = new HourlyEmployee();

      a.setName("John"); 
      a.setAfm("10");
      a.setSalary(70);
    
      b.setName("Bob");
      b.setAfm("10");
      b.setHoursPayment(20);
      b.setHoursWorked(3); 
      b.setAfm("5");
      e[0]=a;
      e[1]=b;
  
     for(Employee j: e){
         System.out.println("Name: "+j.getName());
         System.out.println("Payment: "+j.payment());
     }
      

        
        
    }
    
}
