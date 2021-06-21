package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Document implements Serializable {
	
	@JacksonXmlProperty(localName = "General")
	private General general;

	@JsonProperty("Customer")
	private Customer customer;

	@JsonProperty("Delivery")
	private Delivery delivery;
	
	@JsonProperty("Payments")
	private Payments payments;
	
	@JsonProperty("Rows")
	private Rows rows;
	
	@JsonProperty("Amounts")
	private Amounts amounts;
	
	@JsonProperty("Commission")
	private Commission commission;
	
	@JsonProperty("Shipping")
	private Shipping shipping;

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Payments getPayments() {
		return payments;
	}

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

	public Rows getRows() {
		return rows;
	}

	public void setRows(Rows rows) {
		this.rows = rows;
	}

	public Amounts getAmounts() {
		return amounts;
	}

	public void setAmounts(Amounts amounts) {
		this.amounts = amounts;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Document [general=");
		builder.append(general);
		builder.append(", customer=");
		builder.append(customer);
		builder.append(", delivery=");
		builder.append(delivery);
		builder.append(", payments=");
		builder.append(payments);
		builder.append(", rows=");
		builder.append(rows.toString());
		builder.append(", amounts=");
		builder.append(amounts);
		builder.append(", commission=");
		builder.append(commission);
		builder.append(", shipping=");
		builder.append(shipping);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}