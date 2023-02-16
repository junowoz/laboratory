public class MathMagic {
    public static void main(String[] args) {

        // original number
        int myNumber = 5;

        // documentation of original number
        // original number = 5

        // step 1
        int stepOne = myNumber * myNumber;

        // step 2
        int stepTwo = stepOne + myNumber;

        // step 3
        int stepThree = stepTwo / myNumber;

        // step 4
        int stepFour = stepThree + 17;

        // step 5
        int stepFive = stepFour - myNumber;

        // step 6
        int stepSix = stepFive / 6;

        // print the final result
        System.out.println(stepSix);
    }
}
