package it.wibs.eplastic.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name = "shipping")
public class ShippingEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SHIPPING_ID")
	private long shippingId;

	@Column(name = "TRACKING_NUMBER")
	private String trackingNumber;
	
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Column(name = "CARRIER")
	private String carrier;
	
	@Column(name = "TRANSPORTED_WEIGHT")
	private String transportedWeight;
	
	@Column(name = "SHIPPED_TIME")
	private String shippedTime;

	public long getShippingId() {
		return shippingId;
	}

	public void setShippingId(long shippingId) {
		this.shippingId = shippingId;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getTransportedWeight() {
		return transportedWeight;
	}

	public void setTransportedWeight(String transportedWeight) {
		this.transportedWeight = transportedWeight;
	}

	public String getShippedTime() {
		return shippedTime;
	}

	public void setShippedTime(String shippedTime) {
		this.shippedTime = shippedTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShippingEntity [shippingId=");
		builder.append(shippingId);
		builder.append(", trackingNumber=");
		builder.append(trackingNumber);
		builder.append(", orderId=");
		builder.append(orderId);
		builder.append(", carrier=");
		builder.append(carrier);
		builder.append(", transportedWeight=");
		builder.append(transportedWeight);
		builder.append(", shippedTime=");
		builder.append(shippedTime);
		builder.append("]");
		return builder.toString();
	}
	
}
