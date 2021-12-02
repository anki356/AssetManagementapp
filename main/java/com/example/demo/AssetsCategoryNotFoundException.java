package com.example.demo;

public class AssetsCategoryNotFoundException extends RuntimeException {

	AssetsCategoryNotFoundException(int id) {
	    super("Could not find AssetsCategory " + id);
	  }
	}
