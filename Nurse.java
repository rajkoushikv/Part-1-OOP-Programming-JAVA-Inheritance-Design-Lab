public class Nurse extends HospitalEmployee {
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    @Override
    public String toString() {
        return  getNameOfHospitalEmployee() + "\t" + getNumberOfHospitalEmployee() + " has " + numOfPatients + " patients" ;
    }
    
    @Override
    public void work() {
        super.work();
        System.out.println(getNameOfHospitalEmployee() + " is a nurse with " + getNumOfPatients() + " patients.");
    }
}