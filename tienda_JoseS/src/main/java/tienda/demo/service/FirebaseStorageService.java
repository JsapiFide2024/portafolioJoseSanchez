/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;




@Service
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El bucketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "techshop-a179d.appspot.com";
    final String rutaSuperiorStorage = "techshop";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile =  "techshop-a179d-firebase-adminsdk-rspia-ccbb1517c1";
   
    
    
}