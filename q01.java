import java.util.Scanner;


public class q01 {
    Scanner input = new Scanner(System.in);
    int tamanho; 

    public int getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }   
    

    
    public void executa(){
        do{
        System.out.println("Digite o tamanho do vetor: (Válido apenas numeros impares)");
        this.setTamanho(input.nextInt());
        if(this.getTamanho()%2==0)
        {
            System.out.println("Numero incorreto, digite um número impar.");
        }
        }
        while(this.getTamanho()%2==0);
        
        int[] vet = new int[tamanho];
        
        int i, j, aux; 
        
        //LE O VETOR
        for(i=0;i<tamanho;i++)
        {
            System.out.println("Digite o valor que ocupa a posição " + i + " do vetor.");
            vet[i]=input.nextInt();
        }
        
        //ORDENA O VETOR POR TAMANHO; 
        for(i=0;i<tamanho;i++)
        {
            for(j=0;j<(tamanho-1);j++)
            {
                if(vet[j]>vet[j+1])
                {
                    aux=vet[j];
                    vet[j]=vet[j+1];
                    vet[j+1] =aux;
                }
            }
        }
        
        /*
        Caso precisar visualizar o vetor ordenado
        for(i=0;i<tamanho;i++)
        {
            System.out.printf(vet[i]+" ");
        }
         */
        
        System.out.println("");
        
        int esq=0;
        int dir=vet.length-1;
        int meio;
        meio=(esq+dir)/2;
        int mediana = vet[meio];
        
        System.out.println("Mediana: " + mediana);
        System.out.println("");
        System.out.println("");
    }
}
