package Easy;

import java.util.Stack;

public class L1047_Duplicate_character {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,-1,1,2,2,3};
        int k = removeDuplicates(nums);
        for(int i=0;i<k;i++)
        {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int length = nums.length;
        int temp = nums[0];
        for(int i=1;i<length;i++) {
            if(nums[i] != temp) {
                nums[++k] = nums[i];
                temp = nums[i];
            }
        }
        ++k;
        return k;

    }

    public static String removeuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int j = -1;
        char[] toCharArray = s.toCharArray();
        int length = toCharArray.length;
        for (int i = 0; i < length; i++) {
            if (j >= 0) {
                if (toCharArray[j] == toCharArray[i]) {
                    --j;
                } else {
                    toCharArray[++j] = toCharArray[i];
                }
            } else {
                toCharArray[++j] = toCharArray[i];
            }
        }
        String uniqueText = "";
        for (int i = 0; i <= j; i++) {
            uniqueText += toCharArray[i];
        }
        return uniqueText;


//        for (char character : s.toCharArray()) {
//            if (!stack.isEmpty()) {
//                Character top = stack.peek();
//                if (top == character) {
//                    stack.pop();
//                } else {
//                    stack.push(character);
//                }
//            } else {
//                stack.push(character);
//            }
//        }
//        String revUniqueString = "";
//        while (!stack.isEmpty()) {
//            revUniqueString += stack.peek();
//            stack.pop();
//        }
//        char[] uniqueArray = revUniqueString.toCharArray();
//        int len = revUniqueString.length();
//        for (int i = 0; i <= len / 2; i++) {
//            char temp = uniqueArray[i];
//            uniqueArray[i] = uniqueArray[len - i - 1];
//            uniqueArray[len - i - 1] = temp;
//        }
//        String finalText = "";
//        for(char character: uniqueArray) {
//            finalText += character;
//        }
//        return finalText;

    }
}
