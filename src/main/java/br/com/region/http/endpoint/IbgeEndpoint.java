/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.http.endpoint;

import br.com.region.http.response.municipio.IbgeMunicipiosResponse;
import br.com.region.http.response.estado.IbgeEstadosResponse;

import static br.com.region.http.request.ClientHttp.*;

/**
 *
 * @author Luiz_
 */
public class IbgeEndpoint {
    
    final String dsUrlUF = "https://servicodados.ibge.gov.br/api/v1/localidades/estados";
    final String dsUrlMunicipios = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/%s/municipios";
    
    public IbgeEstadosResponse getEstados(){
        
       final String json = httpGet( dsUrlUF );
              
       IbgeEstadosResponse ibgeResponse = new IbgeEstadosResponse();
       ibgeResponse.fromJson(json);
              
       return ibgeResponse;
        
    }
    
    public IbgeMunicipiosResponse getMunicipios( final String dsMunicipio ) {
        
        final String dsUrl = String.format(dsUrlMunicipios, dsMunicipio );
        
        final String json = httpGet(dsUrl );
        
        IbgeMunicipiosResponse ibgeResponse = new IbgeMunicipiosResponse();
        ibgeResponse.fromJson(json);
        
        return ibgeResponse;
        
    }

}
