public class Doctor {
    private boolean worksAtHospital;

    public Doctor(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public boolean isWorksAtHospital() {
        return worksAtHospital;
    }

    public void setWorksAtHospital(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public String treatPatient() {
        return "Gives checkups";
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "worksAtHospital=" + worksAtHospital +
                '}';
    }
}
