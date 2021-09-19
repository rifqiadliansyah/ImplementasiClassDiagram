
package maintest;


 class SalariedEmployee extends Employee{
    private int Salary; 
    
    public void setSalary(int s) {
        this.Salary = s;
    }
    @Override
    public int payment(){
    return Salary;
    }
   
}
