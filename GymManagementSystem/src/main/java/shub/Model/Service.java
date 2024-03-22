package shub.Model;

public class Service {
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private double serviceFee;

    // Generate Constructor using Fields

    /**
     * @param serviceId
     * @param serviceName
     * @param serviceDescription
     * @param serviceFee
     */

    public Service(int serviceId, String serviceName, String serviceDescription, double serviceFee) {
        super();
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceFee = serviceFee;
    }

    // Generate Constructor using Fields

    /**
     * 
     */
    public Service() {
        super();
        // TODO Auto-generated constructor stub
    }

    // Getter methods
    public int getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    // Setter methods
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }
}
