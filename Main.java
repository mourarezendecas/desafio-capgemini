import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt; 
        
        do{
        System.out.println("---Bem Vindo---");
        System.out.println("Digite o exercício que deseja resolver: ");
        System.out.println("1 - QUESTÃO 01");
        System.out.println("2 - QUESTÃO 02");
        System.out.println("3 - QUESTÃO 03");
        System.out.println("0 - ENCERRAR");
        opt=input.nextInt();
        
        switch(opt)
        {
            case 1:
                System.out.println("Questão 01");
                q01 q1 = new q01();
                q1.executa();
                break;
            
            case 2:
                System.out.println("Questão 02");
                q02 q2 = new q02(); 
                q2.executa();
                break; 
        }
        }
        while(opt!=0);
    }
    
}
