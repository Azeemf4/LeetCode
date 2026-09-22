class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int l=1;
        int h=position[n-1]-position[0];
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            int c=1;
            int last=position[0];
            for(int i=1;i<n;i++){
                if(position[i]-last>=mid){
                    c++;
                    last=position[i];
                }
                if(c==m){
                    break;
                }

            }
            if(c>=m){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
        }
    }
