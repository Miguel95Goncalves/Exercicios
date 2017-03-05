package Exercicio2;

import Exercicio2.Aluno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Exercicio2 {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public Exercicio2(){
        Aluno a = new Aluno("Timótio", (float) 17.8, "931456829");
        alunos.add(a);
        
        a = new Aluno("Rasfásio", (float) 14.5, "926337423");
        alunos.add(a);
        
        a = new Aluno("Andrioleta", (float) 12.6, "919937468");
        alunos.add(a);
        
        a = new Aluno("Lisménia", (float) 13.1, "968723460");
        alunos.add(a);
        
        a = new Aluno("Listânio", (float) 11.3, "968237480");
        alunos.add(a);
        
        ordenar();
        listar();
        
    }
    
    public void listar(){
        for(int i=0;i<alunos.size();i++)
        {
            System.out.println(alunos.get(i).getNome());
            System.out.println(alunos.get(i).getNota());
            System.out.println(alunos.get(i).getContacto());
        }
        
    }
    
    public void ordenar(){
        Collections.sort(alunos, new Comparator<Aluno>(){
            public int compare(Aluno o1, Aluno o2){
                    return (int) (o1.getNota() - o2.getNota());
            }
        });
                }
}
