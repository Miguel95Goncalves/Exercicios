package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    ArrayList<String> elementos = new ArrayList();
    public Exercicio1(){
        elementos.add("b");
        elementos.add("3");
        elementos.add("Carruagens");
        elementos.add("8.56");
        elementos.add("Caixas de armazenamento");
        
        int opc;
        
        do
        {
            System.out.println("1 - Inserir\n2 - Listar\n0 - Sair\nInsira a opcao: ");
            opc = (new Scanner(System.in)).nextInt();
            
            switch(opc)
            {
                case 1:
                    String novoElemento;
                    System.out.println("Insira o novo elemento: ");
                    novoElemento = (new Scanner(System.in)).nextLine();
                    elementos = inserir(novoElemento);
                    break;
                    
                case 2:
                    listar();
                    break;
            }
            
        }while(opc!=0);
        
    }
    
    public ArrayList<String> inserir(String ne){
        ArrayList<String> elementos2 = new ArrayList(elementos.size()+1);
        
        elementos2 = elementos;
        elementos2.add(ne);
        
        return elementos2;
    }
    
    public void listar(){
        System.out.println(elementos);
    }
}
