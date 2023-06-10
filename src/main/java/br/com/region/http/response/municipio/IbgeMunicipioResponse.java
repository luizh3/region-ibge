/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.http.response.municipio;

import br.com.region.http.response.ResponseJson;
import org.json.JSONObject;

/**
 *
 * @author Luiz_
 */

public class IbgeMunicipioResponse implements ResponseJson {
    
    private int id;
    private String nome;
    private String uf;
    private String regiao;
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public String getRegiao() {
        return regiao;
    }

    @Override
    public void fromJson(String json) {
        
        JSONObject municipio = new JSONObject( json );
        
        this.id = municipio.getInt("id");
        this.nome = municipio.getString("nome");
        
        JSONObject microRegiao = municipio.getJSONObject("microrregiao");
        JSONObject mesorRegiao = microRegiao.getJSONObject( "mesorregiao" );
        JSONObject ufObject = mesorRegiao.getJSONObject( "UF" );
        JSONObject regiaoObject = ufObject.getJSONObject( "regiao" );

        this.uf = ufObject.getString("sigla");
        this.regiao = regiaoObject.getString("nome");
                        
    }
    
}
