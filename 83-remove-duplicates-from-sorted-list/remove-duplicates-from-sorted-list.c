/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode *p1,*p2;
    if(head==NULL){
        return NULL;
    }
    p1=head;
    p2=head;
    while(p2!=NULL){
    if(p2->val==p1->val ){
        
        p2=p2->next;
    }else{
    p1->next=p2;
    p1=p2;
    p2=p2->next;
    }
    }
    p1->next=NULL;
    return head;
}