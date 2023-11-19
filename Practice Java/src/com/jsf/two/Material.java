package com.jsf.two;

import java.util.List;
import java.util.Objects;

public class Material implements Cloneable{
	
	private int materialId;
	private String materialName;
	private IndustryType industryType;
	private List<String> customers;
	
	
	// default constructor
	public Material() {
		this.materialId  = 2;
		this.materialName = "material2";
	}
	
	// copy constructor
	public Material(Material material) {
		this.materialId = material.materialId;
		this.materialName = material.materialName;
		this.industryType = material.industryType;
		this.customers = material.customers;
	}
	
	// parameterized constructor
	public Material(int materialId, String materialName, IndustryType industryType, List<String> customers) {
		this.materialId = materialId;
		this.materialName = materialName;
		this.industryType = industryType;
		this.customers = customers;
	}
	
	//getters and setters
	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public IndustryType getIndustryType() {
		return industryType;
	}

	public void setIndustryType(IndustryType industryType) {
		this.industryType = industryType;
	}
	
	public List<String> getCustomers() {
		return customers;
	}

	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers, industryType, materialId, materialName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		return Objects.equals(customers, other.customers) && industryType == other.industryType
				&& materialId == other.materialId && Objects.equals(materialName, other.materialName);
	}

	@Override
	public String toString() {
		return "Material [materialId=" + materialId + ", materialName=" + materialName + ", industryType="
				+ industryType + ", customers=" + customers + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Material material = new Material();
		return material;
		//return super.clone();
	}
	
	

}
