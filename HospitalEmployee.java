public class HospitalEmployee {
   protected String name;
   protected int number;

   public HospitalEmployee(String name, int number) {
       this.name = name;
       this.number = number;
   }

   public String getNameOfHospitalEmployee() {
       return name;
   }

   public void setNameOfHospitalEmployee(String name) {
       this.name = name;
   }

   public int getNumberOfHospitalEmployee() {
       return number;
   }

   public void setNumberOfHospitalEmployee(int number) {
       this.number = number;
   }

   @Override
   public String toString() {
       return getNameOfHospitalEmployee() + "\t"+ getNumberOfHospitalEmployee();
   }
   
   public void work()
   {
   System.out.println (getNameOfHospitalEmployee() + " works for the hospital.");
   }
}

