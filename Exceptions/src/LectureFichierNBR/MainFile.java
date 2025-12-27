package LectureFichierNBR;

import java.util.List;

public class MainFile {

    public static void main(String[] args) {
    	String filePath = "file.in";


        List<Integer> nums = FileUtil.readNumbers(filePath);

        System.out.println("Nombres lus : " + nums);

        for (Integer number : nums) {
            System.out.println(number);
        }
    }
}
