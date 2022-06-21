package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    //findByNomeContaining
    //findByNomeISContaining
    //findByNomeContains


    //findByNomeStartsWith
    //findByNomeEndsWith

    //findByNomeNotContaining


}
