import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {
    public static void main(String[] args) {
//        String test = org.apache.commons.lang3.StringUtils.upperCase("lowercasetouppercase");
//        System.out.println(test);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean isNumber = StringUtils.isNumeric(input);
        String swapCase = StringUtils.swapCase(input);
        String backwards = StringUtils.reverse(input);


        System.out.println(isNumber);
        System.out.println(swapCase);
        System.out.println(backwards);

    }

}
