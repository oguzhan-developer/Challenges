import java.util.ArrayList;
import java.util.Random;
public class QuickSortAlgorithm {

    static int repeatCounter = 0;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<15;i++)
            list.add(new Random().nextInt(100));
        System.out.println(sort(list));
    }

    static ArrayList<Integer> sort(ArrayList<Integer> list)
    {
        repeatCounter++;
        int choosedIndex =  new Random().nextInt(list.size());
        ArrayList<Integer> smallNums = new ArrayList<Integer>();
        ArrayList<Integer> bigNums = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(choosedIndex)<list.get(i))smallNums.add(list.get(i));
            if(list.get(choosedIndex)>list.get(i))bigNums.add(list.get(i));
        }
        bigNums.add(list.get(choosedIndex));
        bigNums.addAll(smallNums);

        for(int i=0;i<bigNums.size();i++)
        {
            if(i != bigNums.size()-1)
            {
                if(bigNums.get(i) > bigNums.get(i+1))return sort(bigNums);
            }
        }
        return bigNums;
    }

}
