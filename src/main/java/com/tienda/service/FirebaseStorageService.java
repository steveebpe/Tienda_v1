
package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-f84b2.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-f84b2-firebase-adminsdk-khj6s-ec9296acda.json";
    
}
