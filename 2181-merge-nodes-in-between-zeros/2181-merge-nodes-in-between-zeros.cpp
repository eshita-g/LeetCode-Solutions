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
    ListNode* mergeNodes(ListNode* head) {
        int sum = 0;
        ListNode *cpt = head;
        ListNode *temp = head->next;
        ListNode *ptr = head;
        while(temp->next != NULL)
        {
            if(temp->val != 0)
            {
                ptr->val = ptr->val + temp->val;
            }
            else
            {
                ptr->next  = temp;
                ptr = ptr->next;
                
            }
            temp = temp -> next;
        }
        ptr->next = NULL;
        return cpt;
    }
};