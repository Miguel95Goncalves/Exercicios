
package exercicio;

import java.util.Scanner;

public class Exercicio1 {
    
    int[] array = new int[]{2,4,6,8};
    
    public Exercicio1(){
        int opc;
        
        do
        {
            System.out.println("1 - Adicionar\n2 - Eliminar\n0 - Sair\nIntroduza a opção: ");
            opc = (new Scanner(System.in)).nextInt();

            switch(opc)
            {
                case 1:
                    int n;
                    System.out.println("Introduza o novo numero: ");
                    n = (new Scanner(System.in)).nextInt();

                    array=addNumber(n);
                    
                    for(int i=0;i<array.length;i++)
                    {
                        System.out.println(array[i]);
                    }
                    break;

                case 2:
                    int pos;
                    System.out.println("Qual a posição a eliminar: ");
                    pos = (new Scanner(System.in)).nextInt();
                    
                    array=delNum(pos);
                    
                    for(int i=0;i<array.length;i++)
                    {
                        System.out.println(array[i]);
                    }
                    break;
            }
        }while(opc!=0);
        
    }
    
    public int[] addNumber(int novoNumero){
        int[] array2 = new int[array.length+1];
        
        for(int i=0;i<array.length;i++)
        {
            array2[i]=array[i];
        }
        array2[array.length]=novoNumero;
        
        return array2;
    }
    
    public int[] delNum(int pos){
        int[] array2 = new int[array.length-1];
        
        for(int i=0;i<array2.length;i++)
        {
            if(i!=pos)
            {
                array2[i]=array[i];
            }
            else
            {
                array2[i]=array[i+1];
                pos=i+1;
            }
        }
        
        return array2;
    }
    
}
