
/*
two loop simple brut forse aproch used in this 
 for(int i=0;i<a.length-1;i++)
          for(int j=i+1;j<a.length;j++)
*/

class Solution {
    public int[] twoSum(int[] a, int target)
    {
        int n1=0;
        int n2=0;
      for(int i=0;i<a.length-1;i++)
      {
          for(int j=i+1;j<a.length;j++)
          {
              if(a[i]+a[j]==target)
              {
                  n1=i;
                  n2=j;
              }
          }
              
      }
        int a2[]=new int[2];
        a2[0]=n1;
        a2[1]=n2;
        return a2;
    }
}
