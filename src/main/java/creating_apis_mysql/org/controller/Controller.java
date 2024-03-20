package creating_apis_mysql.org.controller;
import creating_apis_mysql.org.entity.Produto;
import creating_apis_mysql.org.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ProdutoService service;

    @PostMapping("/salvar-carro")
    public Produto addProduto(@RequestBody Produto produto){
        return service.saveCarro(produto);
    }

    @PostMapping("/salvar-carros")
     public List<Produto> addProdutos(@RequestBody List<Produto> produto){
        return service.saveCarros(produto);
    }

    @GetMapping("/ver-todos-carros")
    public List<Produto> findAllProdutos(){
        return service.getTodosCarros();
    }

    @GetMapping("/encontrar-carros")
    public Produto findProdutoById(int id){
        return service.getCarroById(id);
    }


}
