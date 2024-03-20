package creating_apis_mysql.org.service;

import creating_apis_mysql.org.entity.Produto;
import creating_apis_mysql.org.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto saveCarro(Produto produto){
       return repository.save(produto);
    }
    public List<Produto> saveCarros(List<Produto> produto){
        return repository.saveAll(produto);
    }

    public List<Produto> getCarro(){
           return repository.findAll();
    }

    public List<Produto> getTodosCarros(){
        return repository.findAll();
    }

    public Produto getCarroById(int id){
        return repository.findById(id).orElse(null);
    }

    public Produto getCarroByName(String name){
        return repository.findByName(name);
    }

    public String deleteCarro(int id){
        repository.deleteById(id);
        return "Carro removido!" + id;
    }

    public Produto updateCarro(Produto produto){
        Produto existingprroduct=repository.findById(produto.getId()).orElse(produto);
        existingprroduct.setName(produto.getName());
        existingprroduct.setMarca(produto.getMarca());
        existingprroduct.setModelo(produto.getModelo());
        existingprroduct.setPotencia(produto.getPotencia());
        return  repository.save(existingprroduct);
    }


}
