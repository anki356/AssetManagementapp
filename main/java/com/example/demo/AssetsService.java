package com.example.demo;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  

@Service  
public class AssetsService   
{  
@Autowired  
AssetsRepository assetsrepository;
//AssetsRepository assetsRepository;
//getting all student records  
public List<Assets> getAllAssets()   
{  
List<Assets> assets = new ArrayList<Assets>();  
assetsrepository.findAll().forEach(Assets->assets.add(Assets)); 
return assets;
}  
//getting a specific record  
public Assets getAssetsById(String name)   
{  
return assetsrepository.findById(name).get();  
}  
public void saveOrUpdateAssets(Assets assets)   
{  
	assetsrepository.save(assets);  
}  
//deleting a specific record  
public void deleteAssets(String name)   
{  
	assetsrepository.deleteById(name);  
} 

}  