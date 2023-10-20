public class leftrotetionarray
{
    public static void main(String[]args){  
      int A[] = {1,2,3,4,5};
      int pos =3;
      int element=100;
      for(int i= A.length-1;i<A.length;i++)
      {
        A[i]=A[i-1];
      }
      A[pos-1]=element;
      for(int i=0;i<A.length;i++)
      {
        System.out.print(A[i]+" ");
      }
  }
}






      
        
    
