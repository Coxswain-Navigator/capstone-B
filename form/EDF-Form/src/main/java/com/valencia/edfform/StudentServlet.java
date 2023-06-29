package com.valencia.edfform;

import entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setStudentName(request.getParameter("studentName"));
            studentEntity.setStudentVid(request.getParameter("studentVid"));
            studentEntity.setStudentDepartment(request.getParameter("studentDepartment"));
            studentEntity.setStudentPosition(request.getParameter("studentPosition"));
            studentEntity.setStudentStartDate(new Date(format.parse(request.getParameter("studentStartDate")).getTime()));

            em.getTransaction().begin();
            em.persist(studentEntity);
            em.getTransaction().commit();

            em.close();
            emf.close();

            response.sendRedirect("success.html"); // redirect to success page

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Optionally handle GET requests
    }
}
