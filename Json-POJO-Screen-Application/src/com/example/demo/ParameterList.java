package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParameterList {

	private String channelType;
	private String stepValue;
	private String visibility;
	private String apiname;
	private String attribute_type;
	private String entityType;
	private String function;
	private String height;
	private String entityDisplayName;
	private String colSpan;
	private String description;
	private String action;
	private String value;
	private String lookup_type;
	private String defaultValue;
	private String lifeCycleId;
	private String orientation;
	private CommonFunction commonFunction;
	private String property;
	private String contentName;
	private String editable;
	private String content_id;
	private String entityTypeId;
	private String rowIndex;
	private String catalogId;
	private String conditional;
	private String tableType;
	private String sequenceId;
	private String entitySubTypeId;
	private ContentJson contentJson;
	private String displayInformation;
	private String entityId;
	private String chart_type_id;
	private String entitySubType;
	private String maxLength;
	private String minLength;
	private String tableName;
	private String name;
	private String rule;
	private String rowSpan;
	private String parameterType;
	private String columnName;
	private String valueType;
	private String columnSpan;
	private String entityTypeValue;
	private String reloadComponent;
	private String schemaName;
	private String width;
   private String entityViewType;
	private String unicode;
	private String entityName;
	private String templateId;
	private String nameOfApi;
	@JsonProperty("DateFormat") 
	private String dateFormat;
	private String sequence;
	private String subType;
	private String columnIndex;
	private String displayName;
	private String viewer;
	private String rowValue;
	private String templateName;
	private List<String> valueList;
    public List<ParamValue> paramValues;
	public List<SelectedValList> selectedvalList;
	private List<Functions> functions;
	
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getStepValue() {
		return stepValue;
	}
	public void setStepValue(String stepValue) {
		this.stepValue = stepValue;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public String getApiname() {
		return apiname;
	}
	public void setApiname(String apiname) {
		this.apiname = apiname;
	}
	public String getAttribute_type() {
		return attribute_type;
	}
	public void setAttribute_type(String attribute_type) {
		this.attribute_type = attribute_type;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getEntityDisplayName() {
		return entityDisplayName;
	}
	public void setEntityDisplayName(String entityDisplayName) {
		this.entityDisplayName = entityDisplayName;
	}
	public String getColSpan() {
		return colSpan;
	}
	public void setColSpan(String colSpan) {
		this.colSpan = colSpan;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLookup_type() {
		return lookup_type;
	}
	public void setLookup_type(String lookup_type) {
		this.lookup_type = lookup_type;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getLifeCycleId() {
		return lifeCycleId;
	}
	public void setLifeCycleId(String lifeCycleId) {
		this.lifeCycleId = lifeCycleId;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public CommonFunction getCommonFunction() {
		return commonFunction;
	}
	public void setCommonFunction(CommonFunction commonFunction) {
		this.commonFunction = commonFunction;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public String getEditable() {
		return editable;
	}
	public void setEditable(String editable) {
		this.editable = editable;
	}
	public String getContent_id() {
		return content_id;
	}
	public void setContent_id(String content_id) {
		this.content_id = content_id;
	}
	public String getEntityTypeId() {
		return entityTypeId;
	}
	public void setEntityTypeId(String entityTypeId) {
		this.entityTypeId = entityTypeId;
	}
	public String getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public String getConditional() {
		return conditional;
	}
	public void setConditional(String conditional) {
		this.conditional = conditional;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public String getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}
	public String getEntitySubTypeId() {
		return entitySubTypeId;
	}
	public void setEntitySubTypeId(String entitySubTypeId) {
		this.entitySubTypeId = entitySubTypeId;
	}
	public ContentJson getContentJson() {
		return contentJson;
	}
	public void setContentJson(ContentJson contentJson) {
		this.contentJson = contentJson;
	}
	public String getDisplayInformation() {
		return displayInformation;
	}
	public void setDisplayInformation(String displayInformation) {
		this.displayInformation = displayInformation;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getChart_type_id() {
		return chart_type_id;
	}
	public void setChart_type_id(String chart_type_id) {
		this.chart_type_id = chart_type_id;
	}
	public String getEntitySubType() {
		return entitySubType;
	}
	public void setEntitySubType(String entitySubType) {
		this.entitySubType = entitySubType;
	}
	public String getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}
	public String getMinLength() {
		return minLength;
	}
	public void setMinLength(String minLength) {
		this.minLength = minLength;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public String getRowSpan() {
		return rowSpan;
	}
	public void setRowSpan(String rowSpan) {
		this.rowSpan = rowSpan;
	}
	public String getParameterType() {
		return parameterType;
	}
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getColumnSpan() {
		return columnSpan;
	}
	public void setColumnSpan(String columnSpan) {
		this.columnSpan = columnSpan;
	}
	public String getEntityTypeValue() {
		return entityTypeValue;
	}
	public void setEntityTypeValue(String entityTypeValue) {
		this.entityTypeValue = entityTypeValue;
	}
	public String getReloadComponent() {
		return reloadComponent;
	}
	public void setReloadComponent(String reloadComponent) {
		this.reloadComponent = reloadComponent;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public String getEntityViewType() {
		return entityViewType;
	}
	public void setEntityViewType(String entityViewType) {
		this.entityViewType = entityViewType;
	}
	public String getUnicode() {
		return unicode;
	}
	public void setUnicode(String unicode) {
		this.unicode = unicode;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getNameOfApi() {
		return nameOfApi;
	}
	public void setNameOfApi(String nameOfApi) {
		this.nameOfApi = nameOfApi;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getColumnIndex() {
		return columnIndex;
	}
	public void setColumnIndex(String columnIndex) {
		this.columnIndex = columnIndex;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getViewer() {
		return viewer;
	}
	public void setViewer(String viewer) {
		this.viewer = viewer;
	}
	public String getRowValue() {
		return rowValue;
	}
	public void setRowValue(String rowValue) {
		this.rowValue = rowValue;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public List<String> getValueList() {
		return valueList;
	}
	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}
	public List<ParamValue> getParamValues() {
		return paramValues;
	}
	public void setParamValues(List<ParamValue> paramValues) {
		this.paramValues = paramValues;
	}
	public List<SelectedValList> getSelectedvalList() {
		return selectedvalList;
	}
	public void setSelectedvalList(List<SelectedValList> selectedvalList) {
		this.selectedvalList = selectedvalList;
	}
	public List<Functions> getFunctions() {
		return functions;
	}
	public void setFunctions(List<Functions> functions) {
		this.functions = functions;
	}
	@Override
	public String toString() {
		return "ParameterList [channelType=" + channelType + ", stepValue=" + stepValue + ", visibility=" + visibility
				+ ", apiname=" + apiname + ", attribute_type=" + attribute_type + ", entityType=" + entityType
				+ ", function=" + function + ", height=" + height + ", entityDisplayName=" + entityDisplayName
				+ ", colSpan=" + colSpan + ", description=" + description + ", action=" + action + ", value=" + value
				+ ", lookup_type=" + lookup_type + ", defaultValue=" + defaultValue + ", lifeCycleId=" + lifeCycleId
				+ ", orientation=" + orientation + ", commonFunction=" + commonFunction + ", property=" + property
				+ ", contentName=" + contentName + ", editable=" + editable + ", content_id=" + content_id
				+ ", entityTypeId=" + entityTypeId + ", rowIndex=" + rowIndex + ", catalogId=" + catalogId
				+ ", conditional=" + conditional + ", tableType=" + tableType + ", sequenceId=" + sequenceId
				+ ", entitySubTypeId=" + entitySubTypeId + ", contentJson=" + contentJson + ", displayInformation="
				+ displayInformation + ", entityId=" + entityId + ", chart_type_id=" + chart_type_id
				+ ", entitySubType=" + entitySubType + ", maxLength=" + maxLength + ", minLength=" + minLength
				+ ", tableName=" + tableName + ", name=" + name + ", rule=" + rule + ", rowSpan=" + rowSpan
				+ ", parameterType=" + parameterType + ", columnName=" + columnName + ", valueType=" + valueType
				+ ", columnSpan=" + columnSpan + ", entityTypeValue=" + entityTypeValue + ", reloadComponent="
				+ reloadComponent + ", schemaName=" + schemaName + ", width=" + width + ", entityViewType="
				+ entityViewType + ", unicode=" + unicode + ", entityName=" + entityName + ", templateId=" + templateId
				+ ", nameOfApi=" + nameOfApi + ", dateFormat=" + dateFormat + ", sequence=" + sequence + ", subType="
				+ subType + ", columnIndex=" + columnIndex + ", displayName=" + displayName + ", viewer=" + viewer
				+ ", rowValue=" + rowValue + ", templateName=" + templateName + ", valueList=" + valueList
				+ ", paramValues=" + paramValues + ", selectedvalList=" + selectedvalList + ", functions=" + functions
				+ "]";
	}
	
	
}
