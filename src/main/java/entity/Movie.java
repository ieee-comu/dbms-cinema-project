package entity;
// Generated Dec 5, 2019 10:39:33 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Movie generated by hbm2java
 */
public class Movie  implements java.io.Serializable {


     private Integer movieSerialNo;
     private Manager manager;
     private Date createdDate;
     private String soonFlag;
     private String trailerLink;
     private int movieName;
     private String movieDesc;
     private String movieImage;
     private Set canCommentOns = new HashSet(0);

    public Movie() {
    }

	
    public Movie(Manager manager, Date createdDate, String soonFlag, String trailerLink, int movieName, String movieDesc, String movieImage) {
        this.manager = manager;
        this.createdDate = createdDate;
        this.soonFlag = soonFlag;
        this.trailerLink = trailerLink;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.movieImage = movieImage;
    }
    public Movie(Manager manager, Date createdDate, String soonFlag, String trailerLink, int movieName, String movieDesc, String movieImage, Set canCommentOns) {
       this.manager = manager;
       this.createdDate = createdDate;
       this.soonFlag = soonFlag;
       this.trailerLink = trailerLink;
       this.movieName = movieName;
       this.movieDesc = movieDesc;
       this.movieImage = movieImage;
       this.canCommentOns = canCommentOns;
    }
   
    public Integer getMovieSerialNo() {
        return this.movieSerialNo;
    }
    
    public void setMovieSerialNo(Integer movieSerialNo) {
        this.movieSerialNo = movieSerialNo;
    }
    public Manager getManager() {
        return this.manager;
    }
    
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public String getSoonFlag() {
        return this.soonFlag;
    }
    
    public void setSoonFlag(String soonFlag) {
        this.soonFlag = soonFlag;
    }
    public String getTrailerLink() {
        return this.trailerLink;
    }
    
    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }
    public int getMovieName() {
        return this.movieName;
    }
    
    public void setMovieName(int movieName) {
        this.movieName = movieName;
    }
    public String getMovieDesc() {
        return this.movieDesc;
    }
    
    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }
    public String getMovieImage() {
        return this.movieImage;
    }
    
    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }
    public Set getCanCommentOns() {
        return this.canCommentOns;
    }
    
    public void setCanCommentOns(Set canCommentOns) {
        this.canCommentOns = canCommentOns;
    }




}

