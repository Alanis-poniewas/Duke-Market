package br.dev.alanis.dukemarket.app;

import br.dev.alanis.dukemarket.bean.Produto;
import br.dev.alanis.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author sesi2dia
 */
public class DukeMarketAPP {
    public static void main(String[] args) {
        Produto pAux;
        ProdutoDAO pDAO = new ProdutoDAO();

        pAux = new Produto();
        pAux.setCodBarras("11111111");
        pAux.setDescricao("Mouse Logitec Bluetooth");
        pAux.setQnt(50);
        pAux.setValorCompra(80.00);
        pAux.setValorVenda(167.00);

        pDAO.create(pAux);


        pAux = new Produto();
        pAux.setCodBarras("22222222");
        pAux.setDescricao("Teclado USB Gamer");
        pAux.setQnt(80);
        pAux.setValorCompra(104.00);
        pAux.setValorVenda(220.00);

        pDAO.create(pAux);


        pAux = new Produto();
        pAux.setCodBarras("33333333");
        pAux.setDescricao("Microcomputador Dell");
        pAux.setQnt(110);
        pAux.setValorCompra(2400.00);
        pAux.setValorVenda(3200.00);

        pDAO.create(pAux);

        pDAO.getResults().forEach(p -> {System.out.println(p.toString());});
    }
}


// A PARTIR DO 5.2
