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
    ListNode* rotateRight(ListNode* head, int k) {
        int n = 0;
        ListNode *cur = head;
        while(cur != NULL)
        {
            n++;
            cur = cur->next;
        }
        if(k==0 || n<2)
            return head;
        k = k%n;
        int i = 0;
        int rem = n - k;
        if(rem == 0 || rem == n)
            return head;
        cur = head;
        ListNode *prev = NULL;
        while(i!=rem)
        {
            prev = cur;
            cur = cur->next;
            i++;
        }
        prev->next = NULL;
        ListNode *ptr = head;
        head = cur;
        while(cur!=NULL && cur->next != NULL)
        {
            cur = cur->next;
        }
        cur->next = ptr;
        
        
        return head;
        
    }
};