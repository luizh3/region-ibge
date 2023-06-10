/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.http.response.estado;

import br.com.region.http.response.ResponseJson;
import org.json.JSONObject;

/**
 *
 * @author Luiz_
 */
public class IbgeEstadoResponse implements ResponseJson {
    
    private int id;
    private String nome;
    private String sigla;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    @Override
    public void fromJson( final String json) {
        
        JSONObject object = new JSONObject( json );
    
        this.id = object.getInt("id");
        this.nome = object.getString("nome");
        this.sigla = object.getString("sigla");
        
    }
    
}
