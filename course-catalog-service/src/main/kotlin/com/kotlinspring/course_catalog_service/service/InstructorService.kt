package com.kotlinspring.course_catalog_service.service

import com.kotlinspring.course_catalog_service.dto.CourseDTO
import com.kotlinspring.course_catalog_service.dto.InstructorDTO
import com.kotlinspring.course_catalog_service.entity.Course
import com.kotlinspring.course_catalog_service.entity.Instructor
import com.kotlinspring.course_catalog_service.exception.CourseNotFoundException
import com.kotlinspring.course_catalog_service.repository.CourseRepository
import com.kotlinspring.course_catalog_service.repository.InstructorRepository
import mu.KLogging
import org.springframework.stereotype.Service
import java.util.*

@Service
class InstructorService(val instructorRepository: InstructorRepository) {

    companion object :  KLogging()

    fun createInstructor(instructorDTO: InstructorDTO) : InstructorDTO {

        val instructorEntity = instructorDTO.let {
            Instructor(it.id, it.name)
        }

        instructorRepository.save(instructorEntity)

        logger.info("Saved instructor is : $instructorEntity")

        return instructorEntity.let {
            InstructorDTO(it.id, it.name)
        }
    }

    fun findByInstructorId(instructorId: Int): Optional<Instructor> {

        return instructorRepository.findById(instructorId)
    }
}