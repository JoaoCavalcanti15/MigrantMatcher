package tests;
import pt.migrantmatcher.handlers.*;
import pt.migrantmatcher.main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	MigrantMatcher mm = new MigrantMatcher();
	
	@Test
	//Teste de criacao de regioes
	void RegioesTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		vh.identificaContacto(917706014); //inserir 2º voluntario alojamento
		vh.indicaNumPessoas(5);
		vh.indicarRegiao("Cascais");
		
		assertEquals(vh.getCagalogoRegioes().getRegioes().size(), 2);
	}
	
	@Test
	//Teste de criaçao de voluntarios a item
	void VoluntarioItemTest() {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706007); //inserir 2º voluntario item
		vh.indicarDescricao("Meu item é um casaco");
		
		assertEquals(vh.getCagalogoVoluntarios().getItems().size(), 2);
	}
	
	@Test
	//Teste de criacao de voluntarios alojamento
	void VoluntarioAlojamentoTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		vh.identificaContacto(917706014); //inserir 2º voluntario alojamento
		vh.indicaNumPessoas(5);
		vh.indicarRegiao("Cascais");
		
		assertEquals(vh.getCagalogoVoluntarios().getAlojamentos().size(), 2);
	}
	
	@Test
	//Teste da criacao de voluntarios
	void VoluntarioAjudaTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706007); //inserir 2º voluntario item
		vh.indicarDescricao("Meu item é um casaco");
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		vh.identificaContacto(917706014); //inserir 2º voluntario alojamento
		vh.indicaNumPessoas(5);
		vh.indicarRegiao("Cascais");
		
		assertEquals(vh.getCagalogoVoluntarios().getVoluntarios().size(), 4);
	}
	
	@Test
	//Teste da criacao e assossiacao de migrantes a ajuda item
	void MigranteItemTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		AdicionaMigranteHandler mh = mm.getMigranteHandler();
		
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		
		mh.indicaNomeTel("Joao Assis", 917706007);
		mh.indicaNumFamilia(4);
		mh.indicaMembros("Ricardo Maria Artur");
		mh.indicaCabecaCasal(mh.getCatalogoMigrantes().getMigrantes().get(0));
		mh.pedirLista();
		mh.indicaRegiao("Oerias");
		mh.escolherAjudaItem(vh.getCagalogoVoluntarios().getItems().get(0));
		
		assertEquals(mh.getCatalogoMigrantes().getMigrantes().get(0).getAjudasItem().size(), 1);
	}
	
	@Test
	//Teste da criacao de associacao de migrantes a ajuda item
	void MigranteItemDescricaoTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		AdicionaMigranteHandler mh = mm.getMigranteHandler();
		
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		
		mh.indicaNomeTel("Joao Assis", 917706007);
		mh.indicaNumFamilia(4);
		mh.indicaMembros("Ricardo Maria Artur");
		mh.indicaCabecaCasal(mh.getCatalogoMigrantes().getMigrantes().get(0));
		mh.pedirLista();
		mh.indicaRegiao("Oerias");
		mh.escolherAjudaItem(vh.getCagalogoVoluntarios().getItems().get(0));
		
		assertEquals(mh.getCatalogoMigrantes().getMigrantes().get(0).getAjudasItem().get(0).getDescricao(), "Meu item é uma cadeira");
	}
	
	@Test
	//Teste da criacao e assossiacao de migrantes a ajuda alojamento
	void MigranteAlojamentoTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		AdicionaMigranteHandler mh = mm.getMigranteHandler();
			
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		
		mh.indicaNomeTel("Joao Assis", 917706007);
		mh.indicaNumFamilia(4);
		mh.indicaMembros("Ricardo Maria Artur");
		mh.indicaCabecaCasal(mh.getCatalogoMigrantes().getMigrantes().get(0));
		mh.pedirLista();
		mh.indicaRegiao("Oerias");
		mh.escolherAjudaAlojamento(vh.getCagalogoVoluntarios().getAlojamentos().get(0));
			
		assertEquals(mh.getCatalogoMigrantes().getMigrantes().get(0).getAjudasAlojamento().size(), 1);
	}
	
	@Test
	//Teste da criacao e assossiacao de migrantes a ajuda 
	void MigranteAlojamentoRegiaoTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		AdicionaMigranteHandler mh = mm.getMigranteHandler();
			
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		
		mh.indicaNomeTel("Joao Assis", 917706007);
		mh.indicaNumFamilia(4);
		mh.indicaMembros("Ricardo Maria Artur");
		mh.indicaCabecaCasal(mh.getCatalogoMigrantes().getMigrantes().get(0));
		mh.pedirLista();
		mh.indicaRegiao("Oerias");
		mh.escolherAjudaAlojamento(vh.getCagalogoVoluntarios().getAlojamentos().get(0));
		
		assertEquals(mh.getCatalogoMigrantes().getMigrantes().get(0).getAjudasAlojamento().get(0).getRegiao().getNome(), "Oeiras");
	}
	
	@Test
	//Teste da criacao e assossiacao de migrantes a ajuda 
	void MigranteMembrosTest () {
		AdicionaVoluntarioHandler vh = mm.getVoluntarioHandler();
		AdicionaMigranteHandler mh = mm.getMigranteHandler();
		
		vh.identificaContacto(917706004); //inserir 1º voluntario item
		vh.indicarDescricao("Meu item é uma cadeira");
		vh.identificaContacto(917706011); //inserir 1º voluntario alojamento
		vh.indicaNumPessoas(4);
		vh.indicarRegiao("Oeiras");
		
		mh.indicaNomeTel("Joao Assis", 917706007);
		mh.indicaNumFamilia(4);
		mh.indicaMembros("Ricardo Maria Artur");
		mh.indicaCabecaCasal(mh.getCatalogoMigrantes().getMigrantes().get(0));
		mh.pedirLista();
		mh.indicaRegiao("Oerias");
		mh.escolherAjudaAlojamento(vh.getCagalogoVoluntarios().getAlojamentos().get(0));
		
		assertEquals(mh.getCatalogoMigrantes().getMigrantesFamilia().get(0).getDados(), "Ricardo Maria Artur");
	}
	

}
