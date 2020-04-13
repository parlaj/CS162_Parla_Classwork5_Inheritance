public class Surgeon extends Doctor {

    public Surgeon(boolean worksAtHospital) {
        super(worksAtHospital);
    }

    @Override
    public String treatPatient() {
        return "Performs surgery";
    }

    public String makeIncision() {
        return "Makes incisions";
    }

}
