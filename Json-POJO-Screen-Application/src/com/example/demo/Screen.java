package com.example.demo;

import java.util.List;

public class Screen {
	
	private String entitySubTypeId;
	private String entityViewType;
	private String screenName;
	private String entityId;
	private String entitySubType;
	private String entityType;
	private String version;
	private String entityName;
	private String screenId;
	private String templateType;
	private String entityDisplayName;
	private String entityTypeId;
	private String description;
	private String catalogId;
	private String displayName;
	private List<GroupParamList> groupParamList;
	private List<MappingList> mappingList;
	private List<MappingAssociationList> mappingAssociationList;
	private List<ParameterList> parameterList;

	public String getEntitySubTypeId() {
		return entitySubTypeId;
	}
	public void setEntitySubTypeId(String entitySubTypeId) {
		this.entitySubTypeId = entitySubTypeId;
	}
	public String getEntityViewType() {
		return entityViewType;
	}
	public void setEntityViewType(String entityViewType) {
		this.entityViewType = entityViewType;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getEntitySubType() {
		return entitySubType;
	}
	public void setEntitySubType(String entitySubType) {
		this.entitySubType = entitySubType;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getScreenId() {
		return screenId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getEntityDisplayName() {
		return entityDisplayName;
	}
	public void setEntityDisplayName(String entityDisplayName) {
		this.entityDisplayName = entityDisplayName;
	}
	public String getEntityTypeId() {
		return entityTypeId;
	}
	public void setEntityTypeId(String entityTypeId) {
		this.entityTypeId = entityTypeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public List<GroupParamList> getGroupParamList() {
		return groupParamList;
	}
	public void setGroupParamList(List<GroupParamList> groupParamList) {
		this.groupParamList = groupParamList;
	}
	public List<MappingList> getMappingList() {
		return mappingList;
	}
	public void setMappingList(List<MappingList> mappingList) {
		this.mappingList = mappingList;
	}
	public List<MappingAssociationList> getMappingAssociationList() {
		return mappingAssociationList;
	}
	public void setMappingAssociationList(List<MappingAssociationList> mappingAssociationList) {
		this.mappingAssociationList = mappingAssociationList;
	}
	public List<ParameterList> getParameterList() {
		return parameterList;
	}
	public void setParameterList(List<ParameterList> parameterList) {
		this.parameterList = parameterList;
	}
	
	@Override
	public String toString() {
		return "Screen [entitySubTypeId=" + entitySubTypeId + ", entityViewType=" + entityViewType + ", screenName="
				+ screenName + ", entityId=" + entityId + ", entitySubType=" + entitySubType + ", entityType="
				+ entityType + ", version=" + version + ", entityName=" + entityName + ", screenId=" + screenId
				+ ", templateType=" + templateType + ", entityDisplayName=" + entityDisplayName + ", entityTypeId="
				+ entityTypeId + ", description=" + description + ", catalogId=" + catalogId + ", displayName="
				+ displayName + ", groupParamList=" + groupParamList + ", mappingList=" + mappingList
				+ ", mappingAssociationList=" + mappingAssociationList + ", parameterList=" + parameterList + "]";
	}
	

}
