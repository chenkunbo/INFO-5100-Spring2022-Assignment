package Question_4;

public class SubtractOperation implements MathOperation{
    int nums1;
    int nums2;

    public int execute(int nums1, int nums2){
        return nums1 - nums2;
    }

    @Override
    public int performOperation(int num1, int num2) {
        return nums1 - nums2;
    }

}
