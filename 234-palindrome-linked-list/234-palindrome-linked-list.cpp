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
    bool isPalindrome(ListNode* head) {
        vector<int> A;
        while(head!=NULL)
        {
            A.push_back(head->val);
            head = head->next;
            
            
        }
        int j = A.size() - 1;
        int i =0;
        while(i<j)
        {
            if(A[i] != A[j])
                return false;
            
            i++;
            j--;
        }
        
        return true;
        
        
        
        
    }
};