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
    ListNode* swapNodes(ListNode* head, int k) {
        
        vector<int> A;
        ListNode *temp = head;
        while(temp != NULL)
        {
            A.push_back(temp->val);
            temp = temp->next;
        }
        int a;
        int n = A.size();
        a = A[n-k];
        A[n-k] = A[k-1];
        A[k-1] = a;
        temp = head;
        int  i = 0;
        while(temp != NULL)
        {
            temp->val = A[i];
            i++;
            temp = temp -> next;
            
        }
        
        return head;
        
        
    }
};