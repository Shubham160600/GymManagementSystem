package shub.Model;

import java.time.LocalDate;
import java.util.Date;

public class Payment {
    private int paymentId;
    private Member member;
    private double amount;
    private LocalDate paymentDate;

    // Generate Constructor using Fields

    /**
     * @param paymentId
     * @param member
     * @param amount
     * @param paymentDate
     */
    public Payment(int paymentId, Member member, double amount, LocalDate paymentDate) {
        super();
        this.paymentId = paymentId;
        this.member = member;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Generate Constructors from Superclass

    /**
     * 
     */
    public Payment() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Payment(int i, double d, Date date) {
        // TODO Auto-generated constructor stub
    }

    // Getter methods
    public int getPaymentId() {
        return paymentId;
    }

    public Member getMember() {
        return member;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    // Setter methods
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
