package Session.persistent.maven;
public class ProductOrder {

	private double orderId;
	private String customerName;
	private double item1;
	private double item2;
	private double item3;
//	private int totalAmount;
	public ProductOrder(double orderId, String customerName, double item1, double item2, double item3) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	public ProductOrder() {
		
	}
	
	public double getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getItem1() {
		return item1;
	}
	public void setItem1(int item1) {
		this.item1 = item1;
	}
	public double getItem2() {
		return item2;
	}
	public void setItem2(int item2) {
		this.item2 = item2;
	}
	public double getItem3() {
		return item3;
	}
	public void setItem3(int item3) {
		this.item3 = item3;
	}
	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", customerName=" + customerName + ", item1=" + item1 + ", item2="
				+ item2 + ", item3=" + item3+"]";
	}
		
	}

	