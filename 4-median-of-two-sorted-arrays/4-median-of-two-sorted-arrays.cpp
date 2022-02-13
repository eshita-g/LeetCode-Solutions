class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> A;
        int i = 0;
        int j = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        while(i<n1 && j<n2)
        {
            if(nums1[i] <= nums2[j])
            {
                A.push_back(nums1[i]);
                i++;
            }
            else
            {
                A.push_back(nums2[j]);
                j++;
            }
            
        }
        while(i<n1)
        {
            A.push_back(nums1[i]);
            i++;
            
        }
        while(j<n2)
        {
            A.push_back(nums2[j]);
            j++;
        }
        int n = n1+n2;
        double med;
        double d = 2;
        if(n%2 != 0)
            med = A[n/2];
        else
        {
            n = n/2;
            med = double(A[n] + A[n-1])/d;
        }        
        return med;
    }
};