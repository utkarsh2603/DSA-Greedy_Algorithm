import java.util.*;

public class Activity_Selection_Sorted_End_Time
{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=lastEnd)
            {
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Max Activity is "+maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}
