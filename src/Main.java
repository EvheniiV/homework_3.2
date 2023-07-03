public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double height = 1.83;
        double weight = 95;
        double index = bmi.calculate(height, weight);

        System.out.println((int) index);


    }
}
