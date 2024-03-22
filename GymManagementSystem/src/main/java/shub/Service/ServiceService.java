package shub.Service;

import java.util.List;

import org.hibernate.service.Service;

public interface ServiceService {
    void addService(Service service);

    void updateService(Service service);

    void deleteService(int serviceId);

    void exitService(int serviceId);

    Service getServiceById(int serviceId);

    List<GymService> getAllServices();
}
