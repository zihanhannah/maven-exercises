import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

import java.util.ArrayList;


public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;
        System.out.println(num);
        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum + 1);//go to the negative value when overflow
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));//eg. the bank account over the Integer.MAX_VALUE, that's so sad to see the negative number
        } catch(ArithmeticException e){
            System.out.println("That number is too big, genius.");
        }
        String nameTag = "Hello,,, My, name, is,, Joe!";
        String[] cutUpTag = nameTag.split(",");
        System.out.println(cutUpTag.length);

        ArrayList<String> cutUpTag1 = new ArrayList<>();
        Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag).forEach(cutUpTag1::add);

        for(int i = 0; i < cutUpTag.length; i ++){
            System.out.println(cutUpTag[i]);

        }
        for(int i = 0 ; i < cutUpTag1.size(); i++){
            System.out.println(cutUpTag1.get(i));
        }


    }

}
