package entity;
// Generated Dec 5, 2019 10:39:33 PM by Hibernate Tools 4.3.1



/**
 * CanCommentOn generated by hbm2java
 */
public class CanCommentOn  implements java.io.Serializable {


     private CanCommentOnId id;
     private Customer customer;
     private Movie movie;

    public CanCommentOn() {
    }

    public CanCommentOn(CanCommentOnId id, Customer customer, Movie movie) {
       this.id = id;
       this.customer = customer;
       this.movie = movie;
    }
   
    public CanCommentOnId getId() {
        return this.id;
    }
    
    public void setId(CanCommentOnId id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }




}

