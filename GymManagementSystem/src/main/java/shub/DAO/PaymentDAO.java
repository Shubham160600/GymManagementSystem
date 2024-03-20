package shub.DAO;

import java.util.List;

import shub.Model.Payment;

public interface PaymentDAO {
    void addPayment(Payment payment);
    void updatePayment(Payment payment);
    void deletePayment(int paymentId);
    void exitPayment(int paymentId);
    Payment getPaymentById(int paymentId);
    List<Payment> getAllPayments(); 
}
