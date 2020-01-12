package com.jcode.geetha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Lakshan harischandra
 */
@Entity
@Table(name = "approval")
public class Approval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "approval_id")
    private Integer approvalId;
    @Basic(optional = false)
    @NotNull(message = "Date approved cannot be null")
    @Column(name = "date_approved")
    @Temporal(TemporalType.DATE)
    private Date dateApproved;
    @Size(max = 45, message = "Maximum character size exceeded for approval remark - 45")
    @Column(name = "remark")
    private String remark;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "approvalId")
    private List<Post> postCollection;
    @JsonBackReference
    @JoinColumn(name = "admin_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User adminId;

    public Approval() {
    }

    public Approval(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public Approval(Integer approvalId, Date dateApproved) {
        this.approvalId = approvalId;
        this.dateApproved = dateApproved;
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
        this.dateApproved = dateApproved;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(List<Post> postCollection) {
        this.postCollection = postCollection;
    }

    public User getAdminId() {
        return adminId;
    }

    public void setAdminId(User adminId) {
        this.adminId = adminId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (approvalId != null ? approvalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Approval)) {
            return false;
        }
        Approval other = (Approval) object;
        if ((this.approvalId == null && other.approvalId != null) || (this.approvalId != null && !this.approvalId.equals(other.approvalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Approval[ approvalId=" + approvalId + " ]";
    }

}

