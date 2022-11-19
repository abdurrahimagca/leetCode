bool isPalindrome(struct ListNode *head){
    int lengthOfList = 0;
    int j = 0;
    struct ListNode *p,*p2;
    p = head;
    p2 = head;

    while(p->next != NULL){
        lengthOfList = lengthOfList + 1;
        p = p->next;
    }
    
    int arr[lengthOfList+1];
    int index = 0;

    for (int i = 0; i < lengthOfList+1; i++)
    {
          arr[i] =  p2->val;
          p2 = p2->next;
    }
 
    for(j = 0; j < lengthOfList; j++){
          
                if(arr[j]!=arr[lengthOfList-j]){
                    return false;
                }

        }
    return true;

}