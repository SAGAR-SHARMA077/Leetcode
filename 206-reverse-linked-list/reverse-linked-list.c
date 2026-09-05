/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head == NULL){
        return NULL;
    }
    if(head->next==NULL){
        return head;
    }
    struct ListNode *prev,*curr,*nex;
    prev=head;
    curr = head->next;
    nex=curr->next;
    if(curr->next!=NULL){
    while(nex!=NULL){
        if(prev==head){
            prev->next=NULL;
        }
        curr->next=prev;
        prev=curr;
        curr=nex;
        nex=nex->next;
        curr->next =prev;


    }
    }
    else{
        curr->next=prev;
        prev->next=NULL;
    }
    return curr;
}