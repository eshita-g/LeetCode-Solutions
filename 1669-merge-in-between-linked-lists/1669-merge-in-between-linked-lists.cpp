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
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        ListNode *temp = list1;
        ListNode *end = list1;
        a = a - 1;
        int n = 0;
        while(n!=a)
        {
            temp = temp->next;
            n++;
        }
        n = 0;
        ListNode *cpt = list1;
        b = b+1;
        while(b!=n)
        {
            cpt = cpt->next;
            n++;
        }
        ListNode *start = list2;
        while(start->next != NULL)
        {
            start = start->next;
        }
        temp->next = list2;
        start->next = cpt;
        
        return list1;
        
        
    }
};