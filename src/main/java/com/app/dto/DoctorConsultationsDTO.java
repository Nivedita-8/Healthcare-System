package com.app.dto;

import java.util.List;

import com.app.entity.Doctor;
import com.app.pojos.DoctorConsultations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorConsultationsDTO {
	Doctor doctor;
	List<DoctorConsultations> doctor_consultations;
}
