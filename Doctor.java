public class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return name + "\t" + number + "\t" + specialty;
    }
    
    @Override
    public void work() {
        super.work();
        if(getSpecialty() != "Brain")
        System.out.println(getNameOfHospitalEmployee() + " is a(n) " + getSpecialty() + " doctor.");
    }
}