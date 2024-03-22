package shub.Service;

import java.util.List;

import shub.Model.Payment;

public interface PaymentService {
    void makePayment(Payment payment);

    void updatePayment(Payment payment);

    void deletePayment(int paymentId);

    Payment getPaymentById(int paymentId);

    List<Payment> getAllPayments();

    void exitPayment(int paymentId);
}
