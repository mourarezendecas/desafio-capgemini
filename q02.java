import java.util.Scanner;

public class q02 {
    Scanner input = new Scanner(System.in);
    int tamanho; 

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void executa()
    {
        System.out.printf("Digite o tamanho do vetor: ");
        this.setTamanho(input.nextInt());
        System.out.println("");
        int[] vet = new int[tamanho];
        
        System.out.println("Digite o valor x: ");
        int x = input.nextInt();

        int i, j, cont=0; 
        
        for(i=0;i<tamanho;i++)
        {
            System.out.println("Digite o valor que ocupa a posição " + i + " do vetor.");
            vet[i]=input.nextInt();
        }
        
        for(i=0;i<tamanho;i++)
        {
            for(j=0;j<tamanho;j++)
            {
                  if(vet[i]-vet[j]==x)
                       {
                           cont++;
                       }
            }
        }
        
        System.out.println("No. de pares: " +cont);
    }
}
