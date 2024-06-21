package com.mani.JobApp.repo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mani.JobApp.model.JobPost;

@Repository
public class JobRepo {


    List<JobPost> jobs = new ArrayList<>();

    public JobRepo() {


        jobs.add(new JobPost(1, "Java Developer", "Must have good knowledge in core Java and advanced Java", 0,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));


        jobs.add(new JobPost(2, "Frontend Developer", "Knowledge in building responsive web applications using React",
                0, List.of("HTML", "CSS", "JavaScript", "React")));


        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));


        jobs.add(new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")));

    }

    public List<JobPost> returnAllJobPosts() {
        return jobs;
    }

    public void addJobPost(JobPost job) {
        jobs.add(job);

    }

}