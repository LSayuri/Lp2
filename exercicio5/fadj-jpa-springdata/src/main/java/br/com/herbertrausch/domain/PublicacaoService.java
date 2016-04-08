package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}
	//procurar publicacao por pagina//
	public List<Publicacao> getPublicacaoByPagina(String p) {
		try {
			
			List<Publicacao> publicacoes = db.findByPagina(p);
			return publicacoes;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Publicacao>();

		}
	}
	
	//listar todos//
	public List<Publicacao> getPublicacoes() {
		try {
			
			List<Publicacao> publicacoes = (List<Publicacao>) db.findAll();
			return publicacoes;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Publicacao>();

		}
	}
	
	//findOne//
	public Publicacao getPublicacao(Long id) {
		try {
			
			return db.findOne(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	

}
