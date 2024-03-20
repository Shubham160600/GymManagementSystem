package shub.Service;

import java.util.List;

import org.hibernate.service.Service;

import shub.DAO.ServiceDAO;

public class ServiceServiceImpl implements ServiceService {
    private ServiceDAO serviceDAO;

    public ServiceServiceImpl(ServiceDAO serviceDAO) {
        this.serviceDAO = serviceDAO;
    }

    @Override
    public void addService(Service service) {
        serviceDAO.addService(service);
    }

    @Override
    public void updateService(Service service) {
        serviceDAO.updateService(service);
    }

    @Override
    public void deleteService(int serviceId) {
        serviceDAO.deleteService(serviceId);
    }
    
    @Override
    public void exitService(int serviceId) {
        serviceDAO.exitService(serviceId);
    }

    @Override
    public Service getServiceById(int serviceId) {
        return serviceDAO.getServiceById(serviceId);
    }
    
    @Override
    public List<GymService> getAllServices() {
        return serviceDAO.getAllServices();
    }
}
