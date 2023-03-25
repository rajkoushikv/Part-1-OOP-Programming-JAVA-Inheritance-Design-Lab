public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        return  getNameOfHospitalEmployee()+ "\t" +getNumberOfHospitalEmployee()+ "\t" +getSpecialty() + "\t Operating: " + isOperating();
    }
    
    @Override
    public void work() {
        super.work();
        System.out.println(getNameOfHospitalEmployee() + " is operating now.");
    }
}
