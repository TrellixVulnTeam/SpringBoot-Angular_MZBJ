package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JacksonXmlRootElement(localName = "Rows")
public class Rows implements Serializable{

	@JsonProperty("Row")
	private List<Row> row;

	public List<Row> getRowList() {
		return row;
	}

	public void setRowList(List<Row> row) {
		this.row = row;
	}
	
	
}
