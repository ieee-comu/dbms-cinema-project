package entity;
// Generated Dec 8, 2019 1:55:43 AM by Hibernate Tools 4.3.1



/**
 * Reserves generated by hbm2java
 */
public class Reserves  implements java.io.Serializable {


     private Integer id;
     private Customer customer;
     private Seat seat;

    public Reserves() {
    }

    public Reserves(Customer customer, Seat seat) {
       this.customer = customer;
       this.seat = seat;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Seat getSeat() {
        return this.seat;
    }
    
    public void setSeat(Seat seat) {
        this.seat = seat;
    }




}


