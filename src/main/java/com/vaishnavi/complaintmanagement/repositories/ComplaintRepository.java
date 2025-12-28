package com.vaishnavi.complaintmanagement.repositories;

import com.vaishnavi.complaintmanagement.model.Complaint;
import com.vaishnavi.complaintmanagement.model.ComplaintStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByStatus(ComplaintStatus status);
}
