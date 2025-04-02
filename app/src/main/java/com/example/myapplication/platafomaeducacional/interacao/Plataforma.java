package com.example.myapplication.platafomaeducacional.interacao;

import android.util.Log;

import com.example.myapplication.platafomaeducacional.classe.Aluno;
import com.example.myapplication.platafomaeducacional.classe.Curso;
import com.example.myapplication.platafomaeducacional.classe.PlataformaDigital;

import plataformaeducacional.excecao.LimiteMaximoInscricoesException;

public class Plataforma extends PlataformaDigital {
    @Override
    protected void LimiteMaximoInscricoes(Curso curso) throws LimiteMaximoInscricoesException {
        super.LimiteMaximoInscricoes(curso);
    }

    @Override
    public void NovoAluno(String nome, String senha, String email) {
        super.NovoAluno(nome, senha, email);
    }

    @Override
    public void NovoCurso(int valor, int limiteInscricoes, String autor, String titulo) {
        super.NovoCurso(valor, limiteInscricoes, autor, titulo);
    }

    @Override
    public void InscreverAluno(String aluno, String curso) throws LimiteMaximoInscricoesException {
        super.InscreverAluno(aluno, curso);
    }

    @Override
    public Curso verificarCurso(String curso) {
        Curso cursoLocal = super.verificarCurso(curso);

        if (cursoLocal != null){
            Log.i("Busca:", "Curso: " + cursoLocal + " .");
        } else {
            Log.i("Busca:", "O curso não existe.");
        }
        return null;
    }

    public Aluno verificarAluno(String aluno) {
        Aluno alunoLocal = super.verificarAluno(aluno);
        if (alunoLocal != null){
            Log.i("Busca: ", "Aluno: " + alunoLocal + " .");
        } else {
            Log.i("Busca: ", "O aluno não existe.");
        }
        return null;
    }
}
