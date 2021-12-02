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
@Autowired  
Employeerepository employeerepository;
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
{  Assets assets=assetsrepository.findById(name).get(); 
if(assets.getAssignmentStatus()=="Recovered") {
	assetsrepository.deleteById(name); 
}
	 
} 

public String assigntoEmloyee(Employee employee)   
{  
	assetsrepository.findById(employee.getAssetname()).get().setAssignmentStatus(1);
    String name=employeerepository.findById(employee.getId()).get().getName();
    String role=employeerepository.findById(employee.getId()).get().getRole();
    
    employeerepository.deleteById(employee.getId());
    employeerepository.save(new Employee(employee.getId(),name,role,employee.getAssetname()));
	return employee.getName();
	
} 
public String recoverfromEmployee(Employee employee)   
{  
	
    assetsrepository.findById(employee.getAssetname()).get().setAssignmentStatus(2);
    String name=employeerepository.findById(employee.getId()).get().getName();
    String role=employeerepository.findById(employee.getId()).get().getRole();
    employeerepository.deleteById(employee.getId());
    employeerepository.save(new Employee(employee.getId(),name,role,null));
	return employee.getName();
	}
	

}  