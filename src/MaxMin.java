//Main Class
public class MaxMin {

    //Nested Static Class
    static class Number {

        int smallest;
        int largest;
    }

    static Number findLargestSmallest(int givenArray[], int sizeofArray) {
        Number num = new Number();

        //Iteration Variable
        int i;

        if (sizeofArray == 1) {
            num.largest = givenArray[0];
            num.smallest = givenArray[0];
            return num;
        }

        if (givenArray[0] > givenArray[1]) {
            num.largest = givenArray[0];
            num.smallest = givenArray[1];
        } else {
            num.largest = givenArray[1];
            num.smallest = givenArray[0];
        }

        for (i = 2; i < sizeofArray; i++) {
            if (givenArray[i] > num.largest) {
                num.largest = givenArray[i];
            } else if (givenArray[i] < num.smallest) {
                num.smallest = givenArray[i];
            }
        }

        return num;
    }

    //Main Method
    public static void main(String args[]) {

        //Initializing an array and assigning values
        int givenArray[] = {1000, 11, 445, 1, 330, 3000};
        int sizeofArray = 6;
        Number num = findLargestSmallest(givenArray, sizeofArray);
        System.out.printf("\nSmallest Number is %d", num.smallest);
        System.out.printf("\nLargest Number is %d", num.largest);
    }
}

