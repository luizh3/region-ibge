/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.service;

import java.util.List;

import  br.com.region.model.estado.EstadoModel;
import  br.com.region.model.municipio.MunicipioModel;

import static br.com.region.converter.ibge.IbgeConverter.*;

import br.com.region.http.response.estado.*;
import br.com.region.http.response.municipio.*;
import br.com.region.http.endpoint.IbgeEndpoint;


/**
 *
 * @author Luiz_
 */
public class IbgeService {
    
    public List<EstadoModel> findEstados() {
        
        IbgeEndpoint ibgeEndpoint = new IbgeEndpoint();
        IbgeEstadosResponse response = ibgeEndpoint.getEstados();
        
        List<EstadoModel> estados = estadoFromResponseToModel( response.getEstados() );
        
        return estados;
        
    }
    
    public List<MunicipioModel> findMunicipiosByUF( final String dsUF ) {
        
        IbgeEndpoint ibgeEndpoint = new IbgeEndpoint();
        IbgeMunicipiosResponse response = ibgeEndpoint.getMunicipios(dsUF);
        
        List<MunicipioModel> municipios = municipioFromResponseToModel(response.getMunicipios());
        
        return municipios;
        
    }
    
    
}
