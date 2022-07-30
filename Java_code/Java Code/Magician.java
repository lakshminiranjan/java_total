import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
 
public class  MagicTrick {
    /*
     * We just need to find the common numbers in both the rows
     * If only one common number than it means that is the number volunteer selected.
     * If no common numbers, it means volunteer cheated
     * If more than one common numbers, its a bad magician :)
     */
    public String getCard(int firstAnswer, ArrayList<ArrayList<Integer>> firstMatrix, int seconAnswer, ArrayList<ArrayList<Integer>> secondMatrix){
        ArrayList<Integer> intersection = getIntersection(firstMatrix.get(firstAnswer-1), secondMatrix.get(seconAnswer-1));
         
        if(intersection.size() == 1){
            return intersection.get(0)+"";
        }
        if(intersection.size() == 0){
            return "Volunteer cheated!";
        }
        return "Bad magician!";
    }
     
    public ArrayList<Integer> getIntersection(ArrayList<Integer> firstRow, ArrayList<Integer> secondRow){
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        Set<Integer> numberSet =new HashSet<Integer>();
         
        for(Integer num: firstRow){
            numberSet.add(num);
        }
         
        for(Integer num: secondRow){
            if(numberSet.contains(num)){
                intersection.add(num);
            }
        }
         
        return intersection;
    }
     
    public static void main(String[] argv) {
        try {
            long startTime = System.currentTimeMillis();
            Reader reader = new FileReader("small.in");
            BufferedReader bufReader = new BufferedReader(reader);
            String x = bufReader.readLine();
            int numOfTestCases = Integer.parseInt(x);
            int count = 0;
     
            File file = new File("small.out");
            FileWriter writer = new FileWriter(file);
            for(count =1; count<= numOfTestCases; count++) {
                String y = bufReader.readLine();
                int firstAnswer = Integer.parseInt(y);
                ArrayList<ArrayList<Integer>> firstMatrix = new ArrayList<ArrayList<Integer>>();
                firstMatrix.add(getIntegerList(bufReader.readLine()));
                firstMatrix.add(getIntegerList(bufReader.readLine()));
                firstMatrix.add(getIntegerList(bufReader.readLine()));
                firstMatrix.add(getIntegerList(bufReader.readLine()));
                 
                String z = bufReader.readLine();
                int secondAnswer = Integer.parseInt(z);
                 
                ArrayList<ArrayList<Integer>> secondMatrix = new ArrayList<ArrayList<Integer>>();
                secondMatrix.add(getIntegerList(bufReader.readLine()));
                secondMatrix.add(getIntegerList(bufReader.readLine()));
                secondMatrix.add(getIntegerList(bufReader.readLine()));
                secondMatrix.add(getIntegerList(bufReader.readLine()));
                 
                 
                String output = new MagicTrick().getCard(firstAnswer, firstMatrix, secondAnswer, secondMatrix);
                writer.write("Case #" + count + ": " + output+"\n");
                System.out.println("Case #" + count + ": " + output);
            }
            writer.close();
            System.out.println("Total time = " + (System.currentTimeMillis() - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    private static ArrayList<Integer> getIntegerList(String s) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        String[] strArr = s.split(" ");
        for (String str : strArr) {
            intList.add(Integer.parseInt(str.trim()));
        }
        return intList;
    }
}