
public class TrappedRainWater {
    public static int trappedrainwater(int heights[]){
        int n=heights.length;
        //calculate left max boundary
        int leftmax[]=new int[n];
        leftmax[0]=heights[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(heights[i], leftmax[i-1]);
        }

        //calculate the right max boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(heights[i], rightmax[i+1]);
        }

        //calculate waterlevel by calculating min of left and right boundries
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);

            trappedwater+=waterlevel-heights[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int heights[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(heights));
    }
    
}
