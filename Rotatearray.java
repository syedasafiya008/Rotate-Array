# Rotate-Array//
  import java.util.Array;
public static RotateArray
  {
  public static void main(String args[])
    {
    int[] nums={1,2,3,4,5,6,7);
    int j=3;
    rotate(nums,j);
    System.out.println("Rotated Array:" +Arrays.toString(nums));
  }
  public static void rotate/(int[] nums, int j)
    {
    int=nums.length;
    j=j%n;
    int [] t=new int[n];
    int i;
    for(i=0i<n;i++)
      {
        t[(i+j)%n]=nums[i];
      }
    int i;
    for(i=0;i<n;i++)
      {
        nums[i]=t[i];
      }
  }
}
