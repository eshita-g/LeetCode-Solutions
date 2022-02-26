/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int getCount(ListNode *head)
    {
        ListNode *cur = head;
        int count = 0;
        while(cur != NULL)
        {
            count++;
            cur = cur -> next;
        }
        return count;
    }
    ListNode *_getIntersectionNode(int d,ListNode *headA,ListNode *headB)
    {
        ListNode *cur1 = headA;
        ListNode *cur2 = headB;
        for(int i=0;i<d;i++)
        {
            if(cur1 == NULL)
            {  
                return NULL;
            }    
            cur1 = cur1->next;
        }
        while(cur1 != NULL && cur2!=NULL)
        {
            if(cur1 == cur2)
                return cur1;
            cur1 = cur1->next;
            cur2 = cur2->next;
        }
        return NULL;
        
        
    }
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        
        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int d;
        
        if(c1 > c2)
        {
            d = c1 - c2;
            return _getIntersectionNode(d,headA,headB);
            
        }
        else
        {
            d = c2 - c1;
            return _getIntersectionNode(d,headB,headA);
        }
        
    }
};