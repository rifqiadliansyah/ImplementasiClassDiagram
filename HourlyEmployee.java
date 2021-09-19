
package maintest;


class HourlyEmployee extends Employee {
    private int hoursWorked;
    private int hoursPayment;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hw) {
        this.hoursWorked = hw;
    }

    public int getHoursPayment() {
        return hoursPayment;
    }

    public void setHoursPayment(int hp) {
        this.hoursPayment = hp;
    }

  
    @Override
    public int payment() {
        return getHoursPayment()*getHoursWorked();
    }

   
    
}
