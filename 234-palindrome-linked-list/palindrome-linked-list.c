/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode *temp = head;
    int a[100001];
    int i=0;
    while(temp != NULL){
        a[i] = temp->val;
        i++;
        temp=temp->next;
    }

    for(int j=0,k=i-1;j<k;j++,k--){
        if(a[j] != a[k])
        return false;
    }
    return true;
}