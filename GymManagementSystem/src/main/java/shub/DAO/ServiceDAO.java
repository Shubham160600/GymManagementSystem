package shub.DAO;

import java.util.List;

import org.hibernate.service.Service;

import shub.Service.GymService;

public interface ServiceDAO {
    void addService(Service service);

    void updateService(Service service);

    void deleteService(int serviceId);

    void exitService(int serviceId);

    Service getServiceById(int serviceId);

    List<GymService> getAllServices();
}
