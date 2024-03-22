package shub.Service;

import java.util.List;

import shub.DAO.PaymentDAO;
import shub.Model.Payment;

public class PaymentServiceImpl implements PaymentService {
    private PaymentDAO paymentDAO;

    public PaymentServiceImpl(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @Override
    public void makePayment(Payment payment) {
        paymentDAO.addPayment(payment);
    }

    @Override
    public void updatePayment(Payment payment) {
        paymentDAO.updatePayment(payment);
    }

    @Override
    public void deletePayment(int paymentId) {
        paymentDAO.deletePayment(paymentId);
    }

    @Override
    public void exitPayment(int paymentId) {
        paymentDAO.exitPayment(paymentId);
    }

    @Override
    public Payment getPaymentById(int paymentId) {
        return paymentDAO.getPaymentById(paymentId);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentDAO.getAllPayments();
    }
}
