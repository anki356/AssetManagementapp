package com.example.demo;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.example.demo.AssetsCategory;  
import com.example.demo.AssetsCategoryService;
//creating RestController  
@RestController  
public class AssetsController   
{  
//autowired the AssetsCategoryService class  
@Autowired  
AssetsCategoryService assetsCategoryService;  
//creating a get mapping that retrieves all the students detail from the database   
@GetMapping("/assetscategories")  
private List<AssetsCategory> getAllassets()   
{  
return assetsCategoryService.getAllAssets();  
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/assetcategory/{id}")  
private AssetsCategory getAssets(@PathVariable("id") int id)   
{  
return assetsCategoryService.getAssetsById(id);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/assetscategory/{id}")  
private void deleteAssets(@PathVariable("id") int id) { 
assetsCategoryService.delete(id);  
}  
//creating post mapping that post the student detail in the database  
@PostMapping("/assetscategories")  
private int saveAssets(@RequestBody AssetsCategory assets)   
{  
	assetsCategoryService.saveOrUpdate(assets);  
return assets.getId();  
}  
}  