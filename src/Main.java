public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double height = 1.95;
        double weight = 62;
        double index = bmi.calculate(height, weight);

        System.out.println((int) index);


    }
}
