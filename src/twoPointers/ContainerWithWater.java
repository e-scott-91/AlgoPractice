package twoPointers;

public class ContainerWithWater {

    public int maxArea(int[] height) {
        int start=0;
        int end=height.length - 1;
        int maxx=Integer.MIN_VALUE;
        while(start<end)
        {
            int temp = 0;
            int a = Math.min(height[start],height[end]);
            temp = a*(end-start);
            maxx=Math.max(maxx,temp);
            if(height[start]<height[end])
                start++;
            else
                end--;
        }
        return maxx;
    }

}
