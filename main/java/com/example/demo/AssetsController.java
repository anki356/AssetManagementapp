package com.example.demo;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
@Autowired  
AssetsService assetsservice;

//creating a get mapping that retrieves all the students detail from the database   
@GetMapping("/assetscategories")  
private List<AssetsCategory> getAllassetsCategory()   
{  
return assetsCategoryService.getAllAssetsCategory();  
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/assetcategory/{id}")  
private AssetsCategory getAssetsCategory(@PathVariable("id") int id)   
{  
return assetsCategoryService.getAssetsCaegoryById(id);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/assetscategory/{id}")  
private void deleteAssetsCategory(@PathVariable("id") int id) { 
assetsCategoryService.deleteAssetsCategory(id);  
}  
//creating post mapping that post the student detail in the database  
@PostMapping("/assetscategories")  
private int saveAssetsCategory(@RequestBody AssetsCategory assets)   
{  
	assetsCategoryService.saveOrUpdateAssetscategory(assets);  
return assets.getId();  
}  
@GetMapping("/assets")
private List<Assets> getAllassets()   
{  
return assetsservice.getAllAssets();
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/asset/{id}")  
private Assets getAssets(@PathVariable("id") String id)   
{  
return assetsservice.getAssetsById(id);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/assets/{name}")  
private void deleteAssets(@PathVariable("name") String name) {
	
		
		assetsservice.deleteAssets(name);
	}
	

//creating post mapping that post the student detail in the database  
@PostMapping("/assets")  
private String saveAssets(@RequestBody Assets assets)   
{  
	assetsservice.saveOrUpdateAssets(assets);  
return assets.getName();  
}  
@PostMapping("/assigntoEmployee")  
private String saveAssetstoEmployee(@RequestBody Employee employee)   
{  
	assetsservice.assigntoEmloyee(employee);  
return employee.getName();  
}
@PostMapping("/recoverfromemployee")  
private void deleteAssetsEmployee(@RequestBody Employee employee) {

assetsservice.recoverfromEmployee(employee);  
} 
}  