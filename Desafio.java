public class Desafio{

  public static int SomaSequencial(int a[],int tamanho){  
          
    int max_atual = 0, max_TOTAL = 0;  
  
    for (int i = 0; i < tamanho; i++){  
        max_TOTAL = max_TOTAL + a[i]; 
        if (max_TOTAL < 0)  
            max_TOTAL = 0;  
      
        else if (max_atual < max_TOTAL)  
            max_atual = max_TOTAL;  
          
    }  
    return max_atual;  
  }

  public static void main(String args[]) {
    
    int vetor[] = { -12,6,-7,-8,1,-10,13,-14,-5,9,12,19,-17,19,0,-15,17,-12,-4,-4};    
    
    System.out.println(SomaSequencial(vetor,20));

  }
}