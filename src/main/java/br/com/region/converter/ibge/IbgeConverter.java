/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.converter.ibge;

import java.util.List;
import java.util.ArrayList;

import br.com.region.model.estado.EstadoModel;
import br.com.region.model.municipio.MunicipioModel;

import br.com.region.http.response.estado.IbgeEstadoResponse;
import br.com.region.http.response.municipio.IbgeMunicipioResponse;

/**
 *
 * @author Luiz_
 */
public class IbgeConverter {
    
    public static List<EstadoModel> estadoFromResponseToModel( final List<IbgeEstadoResponse> estadosResponse ){
        
        List<EstadoModel> estados = new ArrayList<>();
        
        estadosResponse.forEach( ( currentResponse ) -> {
            
            EstadoModel estado = new EstadoModel();
            estado.setId( currentResponse.getId() );
            estado.setNome( currentResponse.getNome() );
            estado.setSigla( currentResponse.getSigla() );
            
            estados.add(estado);
            
        } );
        
        return estados;
        
    }
    
    public static List<MunicipioModel> municipioFromResponseToModel( final List<IbgeMunicipioResponse> municipiosResponse ) {
        
        List<MunicipioModel> municipios = new ArrayList<>();
        
        municipiosResponse.forEach( ( currentResponse ) -> {
        
            MunicipioModel municipio = new MunicipioModel();
            municipio.setId( currentResponse.getId() );
            municipio.setNome( currentResponse.getNome() );
            municipio.setRegiao( currentResponse.getRegiao() );
            municipio.setUf( currentResponse.getUf() );
            
            municipios.add(municipio);
        
        } );
        
        return municipios;

    }
    
}
