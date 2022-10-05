public class Vaccinate {
    public boolean checkCovid(int age, double month) {
        if (age >= 18 && age <= 65) {
            if (month >= 3 && month <= 34) {
                return true;
            } return false;
        } else {
            return false;
        }
    }

}
