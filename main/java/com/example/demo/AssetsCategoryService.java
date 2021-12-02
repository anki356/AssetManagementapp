package com.example.demo;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  

@Service  
public class AssetsCategoryService   
{  
@Autowired  
AssetsCategoryRepository assetscategoryrepository;  
//getting all student records  
public List<AssetsCategory> getAllAssets()   
{  
List<AssetsCategory> assets = new ArrayList<AssetsCategory>();  
assetscategoryrepository.findAll().forEach(AssetsCategory->assets.add(AssetsCategory)); 
return assets;
}  
//getting a specific record  
public AssetsCategory getAssetsById(int id)   
{  
return assetscategoryrepository.findById(id).get();  
}  
public void saveOrUpdate(AssetsCategory assets)   
{  
	assetscategoryrepository.save(assets);  
}  
//deleting a specific record  
public void delete(int id)   
{  
	assetscategoryrepository.deleteById(id);  
}  
}  