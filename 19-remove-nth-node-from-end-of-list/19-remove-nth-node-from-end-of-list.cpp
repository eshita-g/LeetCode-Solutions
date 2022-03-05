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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        ListNode *cur = head;
        int len = 0;
        while(cur != NULL)
        {
            cur = cur->next;
            len++;
        }
        int rem = len - n;
        if(rem == 0)
        {
            head = head->next;
            return head;
        }
        else
        {
            int i =0;
            ListNode *temp = head;
            while(i != rem-1)
            {
                temp = temp->next;
                i++;
            }
            ListNode *ptr = temp->next->next;
            temp->next = ptr;
        }
        
        return head;
        
        
        
    }
};