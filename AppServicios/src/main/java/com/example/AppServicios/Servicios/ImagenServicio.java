/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.AppServicios.Servicios;

import com.example.AppServicios.Entidades.Imagen;
import com.example.AppServicios.Repositorios.ImagenRepositorio;
import com.example.Excepciones.MiException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenServicio {
      @Autowired
    private ImagenRepositorio imagenRepositorio;
    @Transactional
    public Imagen guardar(MultipartFile archivo) throws MiException{
        if (archivo != null) {
            try {
                
                Imagen imagen = new Imagen();
                
                imagen.setMime(archivo.getContentType());
                
                imagen.setNombre(archivo.getName());
                
                imagen.setContenido(archivo.getBytes());
                
                return imagenRepositorio.save(imagen);
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }
       @Transactional
    public Imagen actualizar(MultipartFile archivo, String idImagen) throws MiException{
        if (archivo != null) {
           try {
               
               Imagen imagen = new Imagen();
               
               if (idImagen != null) {
                   Optional<Imagen> respuesta = imagenRepositorio.findById(Long.MIN_VALUE);
                   
                   if (respuesta.isPresent()) {
                       imagen = respuesta.get();
                   }
               }
               
               imagen.setMime(archivo.getContentType());
               
               imagen.setNombre(archivo.getName());
               
               imagen.setContenido(archivo.getBytes());
               
               return imagenRepositorio.save(imagen);
               
           } catch (Exception e) {
               System.err.println(e.getMessage());
           }
       }
       return null;
       
   }
}
