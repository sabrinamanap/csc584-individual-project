<%-- 
    Document   : academic
    Created on : Nov 14, 2025, 11:30:01 AM
    Author     : VivoBook
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Academic Info</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <h1>Academic Information</h1>

    <form action="ProfileServlet" method="POST">

        <input type="hidden" name="step" value="2">

        <!-- PERSONAL INFO forwarded from servlet -->
        <input type="hidden" name="fullname" value="${fullname}">
        <input type="hidden" name="age" value="${age}">
        <input type="hidden" name="birthdate" value="${birthdate}">
        <input type="hidden" name="hobby" value="${hobby}">
        <input type="hidden" name="hobbyDesc" value="${hobbyDesc}">
        <input type="hidden" name="selfIntro" value="${selfIntro}">

        <!-- ACADEMIC INFO -->
        <input type="text" name="studentID" placeholder="Student ID" required>
        <input type="email" name="personalEmail" placeholder="Personal Email" required>
        <input type="email" name="studentEmail" placeholder="Student Email" required>
        <input type="text" name="faculty" placeholder="Faculty" required>
        <input type="text" name="course" placeholder="Course" required>
        <input type="text" name="semester" placeholder="Semester" required>

        <button type="submit">Submit All Info</button>

    </form>
</div>

</body>
</html>
