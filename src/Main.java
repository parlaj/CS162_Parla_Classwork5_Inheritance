public class Main {

    public static void main(String[] args) {
	// write your code here
        Doctor doctor = new Doctor(true);
        Surgeon surgeon = new Surgeon(true);
        //call treat patient for doctor and surgeon
        System.out.println(doctor.treatPatient());
        System.out.println(surgeon.treatPatient());

        //try calling other methods from the Doctor and Surgeon class
        System.out.println(doctor.isWorksAtHospital());
        doctor.setWorksAtHospital(false);
        System.out.println(doctor.isWorksAtHospital());

        System.out.println(surgeon.isWorksAtHospital());
        surgeon.setWorksAtHospital(false);
        System.out.println(surgeon.isWorksAtHospital());

    }
}
