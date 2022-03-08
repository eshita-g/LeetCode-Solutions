/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int pairSum(ListNode* head) {
        vector<int> A;
        while(head != NULL)
        {
            A.push_back(head->val);
            head = head->next;
        }
        int n = A.size();
        int sum = 0;
        int g = INT_MIN;
        for(int i=0;i<n/2;i++)
        {
            sum = A[i] + A[n-1-i];
            if(sum > g)
            {
                g = sum;
            }
        }
        return g;    
        
    }
};