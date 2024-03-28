//package gym.Model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "services")
//public class Service {
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "service_id")
//	private int serviceId;
//    @Column(name = "service_name")
//    private String serviceName;
//    @Column(name = "service_description")
//    private String serviceDescription;
//    @Column(name = "service_fee")
//    private double serviceFee;
//    
//    // Generate Constructor using Fields
//    
//	/**
//	 * @param serviceId
//	 * @param serviceName
//	 * @param serviceDescription
//	 * @param serviceFee
//	 */
//	public Service(int serviceId, String serviceName, String serviceDescription, double serviceFee) {
//		super();
//		this.serviceId = serviceId;
//		this.serviceName = serviceName;
//		this.serviceDescription = serviceDescription;
//		this.serviceFee = serviceFee;
//	}
//	
//	// Generate Constructors from Superclass
//	
//		/**
//		 * 
//		 */
//		public Service() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//
//	// Getters and setters
//
//	public Service(String serviceName2, String serviceDescription2, double serviceFee2) {
//			// TODO Auto-generated constructor stub
//		}
//
//	/**
//	 * @return the serviceId
//	 */
//	public int getServiceId() {
//		return serviceId;
//	}
//	/**
//	 * @param serviceId the serviceId to set
//	 */
//	public void setServiceId(int serviceId) {
//		this.serviceId = serviceId;
//	}
//	/**
//	 * @return the serviceName
//	 */
//	public String getServiceName() {
//		return serviceName;
//	}
//	/**
//	 * @param serviceName the serviceName to set
//	 */
//	public void setServiceName(String serviceName) {
//		this.serviceName = serviceName;
//	}
//	/**
//	 * @return the serviceDescription
//	 */
//	public String getServiceDescription() {
//		return serviceDescription;
//	}
//	/**
//	 * @param serviceDescription the serviceDescription to set
//	 */
//	public void setServiceDescription(String serviceDescription) {
//		this.serviceDescription = serviceDescription;
//	}
//	/**
//	 * @return the serviceFee
//	 */
//	public double getServiceFee() {
//		return serviceFee;
//	}
//	/**
//	 * @param serviceFee the serviceFee to set
//	 */
//	public void setServiceFee(double serviceFee) {
//		this.serviceFee = serviceFee;
//	}
//
//	public String getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//	
///*
// * public static void main(String[] args) { // Creating a sample service object
// * Service service = new Service(); service.setServiceId(1);
// * service.setServiceName("Gym Membership");
// * service.setServiceDescription("Access to gym facilities");
// * service.setServiceFee(50.0);
// * 
// * // Displaying service details System.out.println("Service ID: " +
// * service.getServiceId()); System.out.println("Service Name: " +
// * service.getServiceName()); System.out.println("Service Description: " +
// * service.getServiceDescription()); System.out.println("Service Fee: $" +
// * service.getServiceFee()); } }
// */