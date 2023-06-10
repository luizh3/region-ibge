/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.region.http.response.municipio;

import java.util.ArrayList;
import org.json.JSONArray;

import br.com.region.http.response.ResponseJson;

/**
 *
 * @author Luiz_
 */
public class IbgeMunicipiosResponse implements ResponseJson {
    
    ArrayList<IbgeMunicipioResponse> municipios = new ArrayList<>();
    
    public ArrayList<IbgeMunicipioResponse> getMunicipios() {
        return municipios;
    }
    
    @Override
    public void fromJson( String json ) {
        
        JSONArray data = new JSONArray( json );
        
        data.forEach( ( current ) -> {
            IbgeMunicipioResponse municipioObject = new IbgeMunicipioResponse();
            municipioObject.fromJson( current.toString() );
            municipios.add( municipioObject );
        } );
        
    }

    
    
}
