package com.vaishnavi.complaintmanagement.controller;

import com.vaishnavi.complaintmanagement.model.Complaint;
import com.vaishnavi.complaintmanagement.model.ComplaintStatus; // ✅ Make sure to import this
import com.vaishnavi.complaintmanagement.service.ComplaintService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @PostMapping
    public Complaint createComplaint(@RequestBody Complaint complaint) {
        return complaintService.createComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @GetMapping("/{id}")
    public Complaint getComplaintById(@PathVariable Long id) {
        return complaintService.getComplaintById(id);
    }

    @GetMapping("/status/{status}")
    public List<Complaint> getComplaintsByStatus(@PathVariable String status) {
        // ✅ Convert String to Enum
        ComplaintStatus complaintStatus = ComplaintStatus.valueOf(status.toUpperCase());
        return complaintService.getComplaintsByStatus(complaintStatus);
    }

    @PutMapping("/{id}/status")
    public Complaint updateComplaintStatus(
            @PathVariable Long id,
            @RequestBody Map<String, String> request) {

        // ✅ Convert String to Enum before passing to service
        ComplaintStatus complaintStatus = ComplaintStatus.valueOf(request.get("status").toUpperCase());
        return complaintService.updateStatus(id, complaintStatus);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComplaint(@PathVariable Long id) {
        boolean deleted = complaintService.deleteComplaintById(id);
        if (deleted) {
            return ResponseEntity.ok("Complaint deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Complaint not found");
        }
    }
}
