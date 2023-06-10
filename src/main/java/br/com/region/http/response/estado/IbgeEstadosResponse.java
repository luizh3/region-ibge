/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.http.response.estado;

import br.com.region.http.response.ResponseJson;
import java.util.ArrayList;

import org.json.JSONArray;

/**
 *
 * @author Luiz_
 */
public class IbgeEstadosResponse implements ResponseJson {
    
    ArrayList<IbgeEstadoResponse> estados = new ArrayList<>();

    public ArrayList<IbgeEstadoResponse> getEstados() {
        return estados;
    }
    
    @Override
    public void fromJson(String json) {
        
        final JSONArray jsonData = new JSONArray( json );
        
        jsonData.forEach( ( current ) -> {
            IbgeEstadoResponse ibgeUfResponse = new IbgeEstadoResponse();
            ibgeUfResponse.fromJson( current.toString() );
            estados.add( ibgeUfResponse );
        } );

    }
    
}
