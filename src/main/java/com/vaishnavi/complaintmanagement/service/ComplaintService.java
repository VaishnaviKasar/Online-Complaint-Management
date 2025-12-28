package com.vaishnavi.complaintmanagement.service;

import com.vaishnavi.complaintmanagement.model.Complaint;
import com.vaishnavi.complaintmanagement.model.ComplaintStatus;
import java.util.List;

public interface ComplaintService {
    Complaint createComplaint(Complaint complaint);
    List<Complaint> getAllComplaints();
    Complaint getComplaintById(Long id);
    List<Complaint> getComplaintsByStatus(ComplaintStatus status);
    Complaint updateStatus(Long id, ComplaintStatus status);
    boolean deleteComplaintById(Long id); // Only signature
}
