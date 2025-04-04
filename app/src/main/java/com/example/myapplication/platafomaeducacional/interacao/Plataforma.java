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
    public boolean NovoAluno(String nome, String senha, String email) {
        if (super.NovoAluno(nome, senha, email)){
            Log.i("Registro: ", "O aluno foi registrado.");
        }
        Log.i("Registro: ", "O aluno não foi registrado.");
        return false;
    }

    @Override
    public boolean NovoCurso(int valor, int limiteInscricoes, String autor, String titulo) {
        if (super.NovoCurso(valor, limiteInscricoes, autor, titulo)){
            Log.i("Registro: ", "O curso foi registrado.");
        }
        Log.i("Registro: ", "O curso não foi registrado.");
        return false;
    }

    @Override
    public boolean InscreverAluno(String aluno, String curso) throws LimiteMaximoInscricoesException {
        if (super.InscreverAluno(aluno, curso)){
            Log.i("Registro: ", "O aluno: " + aluno + " foi inscrito no curso: " + curso + ".");
            return false;
        } else {
            Log.i("Registro: ", "O aluno " + aluno + " já está inscrito.");
            return false;
        }
    }

    public Curso getCurso(String curso) {
        Curso cursoLocal = super.verificarCurso(curso);

        if (cursoLocal != null){
            Log.i("Pesquisa: ", "Curso: " + cursoLocal + " .");
        } else {
            Log.i("Pesquisa: ", "O curso " + curso + " não existe.");
        }
        return null;
    }

    public Aluno getAluno(String aluno) {
        Aluno alunoLocal = super.verificarAluno(aluno);
        if (alunoLocal != null){
            Log.i("Pesquisa: ", "Aluno: " + alunoLocal + " .");
        } else {
            Log.i("Pesquisa: ", "O aluno" + aluno + " não existe.");
        }
        return null;
    }
}
