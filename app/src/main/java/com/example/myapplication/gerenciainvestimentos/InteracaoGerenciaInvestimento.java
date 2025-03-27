package com.example.myapplication.gerenciainvestimentos;

public class InteracaoGerenciaInvestimento extends GerenciaInvestimento{
    @Override
    public void totalRetorno() {
        super.totalRetorno();
    }

    @Override
    public void GetInvestimentos() {
        super.GetInvestimentos();
    }

    @Override
    public void GetInvestimentosPorTipo(String tipo) {
        super.GetInvestimentosPorTipo(tipo);
    }

    @Override
    public void NovoInvestimento(String valor, String tipo) {
        super.NovoInvestimento(valor, tipo);
    }

    @Override
    public void DeletarInvestimento(String valor, String tipo) {
        super.DeletarInvestimento(valor, tipo);
    }
}
