/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Adm
 */
public class Produtos {
    Integer id;
    String nome;
    Integer preco;
    String descricao;
    
    public Integer getId() {
        return id;
    }
    public String getNome() { 
        return nome;
    } 
    public Integer getPreco() { 
        return preco;
    }  
    public String getDescricao() {
        return descricao;
    }
    
    public void setId(Integer id) {
        this.id = id;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public void setPreco(Integer preco) { 
        this.preco = preco;
    }     
    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }
}
