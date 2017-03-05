package Exercicio2;

public class Aluno {
    public String nome;
    public float nota;
    public String contacto;

    public Aluno(String nome, float nota, String contacto) {
        this.nome = nome;
        this.nota = nota;
        this.contacto = contacto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
    
}
